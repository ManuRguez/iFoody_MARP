package es.iescarrillo.ifoody_marp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import es.iescarrillo.ifoody_marp.R;
import es.iescarrillo.ifoody_marp.models.Orders;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrderViewHolder> {

    private Context context;

    private List<Orders> orders;

    public OrdersAdapter(Context context,List<Orders> orders){
        this.context = context;
        this.orders = orders;
    }

    @NonNull
    @Override
    public OrdersAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_orders,parent,false);

        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersAdapter.OrderViewHolder holder, int position) {

        Orders orders22 = orders.get(position);

        holder.img.setImageResource(orders22.getImg());
        holder.nombre.setText(orders22.getNombre());
        holder.date.setText(orders22.getDate());
        holder.price.setText(orders22.getPrice());



    }

    @Override
    public int getItemCount() {
        return orders.size();
    }


    public class  OrderViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;

        private TextView nombre;

        private TextView date;

        private TextView price;


        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img_orders);
            nombre = itemView.findViewById(R.id.tvNameOrders);
            date = itemView.findViewById(R.id.tvDateOrders);
            price = itemView.findViewById(R.id.tvPriceOrders);
        }
    }
}
