package es.iescarrillo.ifoody_marp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.adapters.OrdersAdapter;
import es.iescarrillo.ifoody_marp.models.Orders;


public class MyOrders extends Fragment {

    private RecyclerView recyclerViewOrders;

    private OrdersAdapter adapter;


    public MyOrders() {
        // Required empty public constructor
    }

    public static MyOrders newInstance(String param1, String param2) {
        MyOrders fragment = new MyOrders();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);

        recyclerViewOrders = view.findViewById(R.id.rv_orders);

        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(new Orders(R.drawable.jimmy,"Jimmy John’s","20 Jun, 10:30 · 3 Items","$17.10"));
        ordersList.add(new Orders(R.drawable.subway,"Subway","19 Jun, 11:50 · 2 Items","$20.50"));

        adapter = new OrdersAdapter(getContext(),ordersList);

        recyclerViewOrders.setAdapter(adapter);

        LinearLayoutManager layoutManagerOrders = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerViewOrders.setLayoutManager(layoutManagerOrders);

        return view;
    }
}

