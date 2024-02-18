package es.iescarrillo.ifoody_marp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.models.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{


    private Context context;
    private List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories){
        this.context=context;
        this.categories = categories;

    }

    //Metodo en el que vamos a indicar la vista (xml) que vamos a inflar
    @NonNull
    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Indicamos la vista que queremos inflar
        View view = LayoutInflater.from(context).inflate(R.layout.item_category,parent,false);

        //Transformamos o casteamos esa vista en un  ViewHolder(contenedor)
        return new CategoryViewHolder(view);
    }

    //Metodo en el que vamos a modificar los componentes imagenView & textView) de la imagen que hemos inflado anteriormente
    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.CategoryViewHolder holder, int position) {

        //Obtenemos elobjeto segun la posicion en la lista
        Category category = categories.get(position);

        //Modifiamos los componentes
        holder.tvTitle.setText(category.getTitle());
        holder.imgCategory.setImageResource(category.getImage());
    }


    //Numero de elementos de la lista de objetos
    @Override
    public int getItemCount() {
        return categories.size();
    }


    //Clase interna donde vamos a definir los componentes de la vista
    public class CategoryViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCategory;
        private TextView tvTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            //vamos a inicializar los componentes

            imgCategory = itemView.findViewById(R.id.imgCategory);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }

}
