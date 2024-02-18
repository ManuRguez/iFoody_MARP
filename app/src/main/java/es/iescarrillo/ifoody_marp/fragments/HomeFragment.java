package es.iescarrillo.ifoody_marp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.activities.Food_Details;
import es.iescarrillo.ifoody_marp.adapters.CategoryAdapter;
import es.iescarrillo.ifoody_marp.adapters.RestaurantAdapter;
import es.iescarrillo.ifoody_marp.models.Category;
import es.iescarrillo.ifoody_marp.models.Restaurant;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView, recyclerViewRestaurant;
    private CategoryAdapter adapter;
    private RestaurantAdapter adapterRestaurant;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Configuración del primer RecyclerView
        recyclerView = view.findViewById(R.id.rv_categories);
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Buguer", R.drawable.img_burguer));
        categories.add(new Category("Donut", R.drawable.img_donut));
        categories.add(new Category("Pizza", R.drawable.img_pizza_r));
        categories.add(new Category("Hot dogs", R.drawable.img_mexican));
        categories.add(new Category("Sandwich", R.drawable.img_asian));
        categories.add(new Category("Fresh", R.drawable.img_icecream));

        adapter = new CategoryAdapter(getContext(), categories);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Configuración del segundo RecyclerView
        recyclerViewRestaurant = view.findViewById(R.id.rv_restaurant);
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(R.drawable.valoracion,R.drawable.mcdonals, "McDonald's"));
        restaurants.add(new Restaurant(R.drawable.val2, R.drawable.comidilla2, "Starbucks"));

        adapterRestaurant = new RestaurantAdapter(getContext(), restaurants);
        recyclerViewRestaurant.setAdapter(adapterRestaurant);

        LinearLayoutManager layoutManagerRestaurant = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewRestaurant.setLayoutManager(layoutManagerRestaurant);





        return view;
    }

}
