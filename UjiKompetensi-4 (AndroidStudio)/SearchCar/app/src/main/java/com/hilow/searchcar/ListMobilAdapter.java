package com.hilow.searchcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ListMobilAdapter extends RecyclerView.Adapter<ListMobilAdapter.ViewHolder> {

    private Context context;
    private List<Mobil> mobilList;

    public ListMobilAdapter(Context context, List<Mobil> mobilList) {
        this.context = context;
        this.mobilList = mobilList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_mobil, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Mobil mobil = mobilList.get(i);

        viewHolder.tvMerkMobil.setText(mobil.getMerkmobil());
        viewHolder.tvHargaSewa.setText(mobil.getHargasewa());
        Glide.with(context)
                .load(mobil.getGambarmobil())
                .placeholder(R.drawable.logo)
                .into(viewHolder.ivGambarMobil);
    }

    @Override
    public int getItemCount() {
        return mobilList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvMerkMobil, tvHargaSewa;
        ImageView ivGambarMobil;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMerkMobil = itemView.findViewById(R.id.tvMerkMobil);
            tvHargaSewa = itemView.findViewById(R.id.tvHargaSewa);
            ivGambarMobil = itemView.findViewById(R.id.ivMobil);
        }
    }

}
