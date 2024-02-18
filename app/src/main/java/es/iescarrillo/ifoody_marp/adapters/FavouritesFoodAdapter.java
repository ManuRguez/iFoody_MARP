package es.iescarrillo.ifoody_marp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.models.FavouritesFood;

public class FavouritesFoodAdapter extends RecyclerView.Adapter<FavouritesFoodAdapter.FavouritesFoodViewHolder> {
   private Context context;
   private List<FavouritesFood> favouritesFoodLis;

   public FavouritesFoodAdapter(Context context,List<FavouritesFood> favouritesFoodLis){
       this.context = context;
       this.favouritesFoodLis = favouritesFoodLis;
   }

    @NonNull
    @Override
    public FavouritesFoodAdapter.FavouritesFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_favourites_food,parent,false);

        return new FavouritesFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavouritesFoodAdapter.FavouritesFoodViewHolder holder, int position) {

       FavouritesFood favouritesFood = favouritesFoodLis.get(position);

       holder.imgFood.setImageResource(favouritesFood.getImgFood());
       holder.price.setImageResource(favouritesFood.getPrice());
       holder.name.setText(favouritesFood.getName());
       holder.subname.setText(favouritesFood.getSubname());

    }

    @Override
    public int getItemCount() {
        return favouritesFoodLis.size();
    }

    public class FavouritesFoodViewHolder extends  RecyclerView.ViewHolder{
       private ImageView imgFood;

       private ImageView price;

       private TextView name;

       private TextView subname;

        public FavouritesFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.imgFavourite);
            price = itemView.findViewById(R.id.imgPrice1);
            name = itemView.findViewById(R.id.tvName1);
            subname = itemView.findViewById(R.id.tvSubName1);
        }




    }
}

