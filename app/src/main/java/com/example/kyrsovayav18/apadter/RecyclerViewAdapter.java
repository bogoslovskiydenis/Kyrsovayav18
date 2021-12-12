package com.example.kyrsovayav18.apadter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrsovayav18.R;
import com.example.kyrsovayav18.model.Apartmens;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Apartmens> apartmensList;

    public RecyclerViewAdapter(Context mContext, List<Apartmens> apartmensList) {
        this.mContext = mContext;
        this.apartmensList = apartmensList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(apartmensList.get(position).getPicture());
        //set click
        holder.cardView_id.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(mContext, apartmensList.get(position).getDescription() + "Clicked", Toast.LENGTH_SHORT).show();
    }
});
    }

    @Override
    public int getItemCount() {
        return apartmensList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        CardView cardView_id;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            cardView_id = itemView.findViewById(R.id.cardView_id);
        }
    }

}
