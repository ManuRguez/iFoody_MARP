package es.iescarrillo.ifoody_marp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.activities.Food_Details;
import es.iescarrillo.ifoody_marp.models.Restaurant;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private Context context;
    private List<Restaurant> restaurantList;
    private OnItemClickListener onItemClickListener;

    public RestaurantAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_restaurant, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);

        holder.imgValoration.setImageResource(restaurant.getImgValoration());
        holder.imgFoto.setImageResource(restaurant.getImgFoto());
        holder.name.setText(restaurant.getName());

        if (position == 0){
            // Agregar ClickListener al elemento
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   Context context1 = holder.itemView.getContext();
                   Intent intent = new Intent(context1, Food_Details.class);
                   context1.startActivity(intent);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgValoration;
        private ImageView imgFoto;
        private TextView name;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            imgValoration = itemView.findViewById(R.id.imgValoration);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            name = itemView.findViewById(R.id.tvNameRestaurant);
        }
    }
}
