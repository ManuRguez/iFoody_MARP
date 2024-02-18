package es.iescarrillo.ifoody_marp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.adapters.RestaurantAdapter;
import es.iescarrillo.ifoody_marp.fragments.FavoriteFoodFragment;
import es.iescarrillo.ifoody_marp.fragments.HomeFragment;
import es.iescarrillo.ifoody_marp.fragments.MyOrders;
import es.iescarrillo.ifoody_marp.models.Restaurant;


public class Side_Menu_Activity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    private NavigationView menu;

    private Fragment fragment;

    private BottomNavigationView bottomNavigationView;

    private int selectedColor;

    private RecyclerView mcdonalds;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_side);

        loadComponents();

        //Metodo para inciar que el toolbar har´ña la funcion de barra de acciones
        setSupportActionBar(toolbar);


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_menu,R.string.close_menu);

        //Listener para capturar los eventos que se produzcan en el menu lateral
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        fragment = new HomeFragment();

    //Metodo para cargar el fragment
       getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,fragment).commit();

        //Evento para sincronizar el estado del boton hamburguesa con el estado del menu lateral

        actionBarDrawerToggle.syncState();
        menu.setNavigationItemSelectedListener(item -> {

            if(item.getItemId() == R.id.my_orders){
                fragment = new MyOrders();

            }else if (item.getItemId() == R.id.my_profile){
                Toast.makeText(this, "Has pulsado en My profile", Toast.LENGTH_SHORT).show();

            } else if (item.getItemId() == R.id.my_DeliveryAddress) {
                Toast.makeText(this, "Has pulsado en Delivery Address", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.Payments_Methods) {
                Toast.makeText(this, "Has pulsado en Payments Methods", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.contact) {
                Toast.makeText(this, "Has pulsado en Contact Us", Toast.LENGTH_SHORT).show();
            }else if (item.getItemId() == R.id.Settings){
                Toast.makeText(this, "Has pulsado en Settings", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.Helps) {
                Toast.makeText(this, "Has pulsado en Helps FAQs", Toast.LENGTH_SHORT).show();
            }

            //Metodo para cargar el fragment
            getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,fragment).commit();

            //Cargamos el fragment y cerramos el drawe
            drawerLayout.closeDrawers();

            return true;
        });

         selectedColor = R.color.principal;

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.tab_1){
                fragment = new HomeFragment();

                item.getIcon().setTint(selectedColor);

            }else if (item.getItemId() == R.id.tab_2){
                fragment = new HomeFragment();

                item.getIcon().setTint(selectedColor);

            } else if (item.getItemId() == R.id.tab_3) {

                Intent intent = new Intent(getApplicationContext(), Cart_Activity.class);
                startActivity(intent);

                item.getIcon().setTint(selectedColor);

            } else if (item.getItemId() == R.id.tab_4) {


                item.getIcon().setTint(selectedColor);

            }else if (item.getItemId() == R.id.tab_5){
                fragment = new FavoriteFoodFragment();

                item.getIcon().setTint(selectedColor);
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,fragment).commit();
            return true;
        });



    }



    private void loadComponents(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        menu = findViewById(R.id.nvMenu);
        bottomNavigationView = findViewById(R.id.bottomMenu);
        mcdonalds = findViewById(R.id.rv_restaurant);
    }

}