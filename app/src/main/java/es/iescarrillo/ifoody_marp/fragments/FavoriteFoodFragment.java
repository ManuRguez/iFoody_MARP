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
import es.iescarrillo.ifoody_marp.adapters.FavouritesFoodAdapter;
import es.iescarrillo.ifoody_marp.models.FavouritesFood;


public class FavoriteFoodFragment extends Fragment {

    private RecyclerView recyclerViewFav;

    private FavouritesFoodAdapter favouritesFoodAdapter;





    public FavoriteFoodFragment() {
        // Required empty public constructor
    }


    public static FavoriteFoodFragment newInstance(String param1, String param2) {
        FavoriteFoodFragment fragment = new FavoriteFoodFragment();
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
        View view =  inflater.inflate(R.layout.fragment_favorite_food, container, false);

        recyclerViewFav  =view.findViewById(R.id.rv_favourite_food);

        List<FavouritesFood> foods = new ArrayList<>();
        foods.add(new FavouritesFood(R.drawable.favourite_1,R.drawable.price1,"Chicken Hawaiian","Chicken, Cheese and pineapple"));
        foods.add(new FavouritesFood(R.drawable.food2,R.drawable.price2,"Red N Hot Pizza","Chicken, Chili"));
        foods.add(new FavouritesFood(R.drawable.food3,R.drawable.price3,"Chicken Hawaiian","Chicken, Cheese and pineapple"));

        favouritesFoodAdapter = new FavouritesFoodAdapter(getContext(),foods);
        recyclerViewFav.setAdapter(favouritesFoodAdapter);

        LinearLayoutManager layoutManagerFav = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);


        recyclerViewFav.setLayoutManager((layoutManagerFav));
        return view;
    }
}

