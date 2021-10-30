package com.hilow.searchcar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class DetailMobilAdapter extends RecyclerView.Adapter<DetailMobilAdapter.ViewHolder> {

    private Context context;
    private List<DetailMobil> detailMobilList;

    public DetailMobilAdapter(Context context, List<DetailMobil> detailMobilList) {
        this.context = context;
        this.detailMobilList = detailMobilList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_detail_sewa, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        DetailMobil detailMobil = detailMobilList.get(i);

        viewHolder.tvMerkDetail.setText(detailMobil.getDetailmerk());
        viewHolder.tvHargaDetail.setText(detailMobil.getDetailharga());
        Glide.with(context)
                .load(detailMobil.getDetailgambar())
                .placeholder(R.drawable.logo)
                .into(viewHolder.ivGambarDetail);
    }

    @Override
    public int getItemCount() {
        return detailMobilList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvMerkDetail, tvHargaDetail;
        ImageView ivGambarDetail;
        Button btnSewa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMerkDetail = itemView.findViewById(R.id.tvMerkDetail);
            tvHargaDetail = itemView.findViewById(R.id.tvHargaDetail);
            ivGambarDetail = itemView.findViewById(R.id.ivDetail);
            btnSewa = itemView.findViewById(R.id.btnSewa);
            btnSewa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailSewa.class);
                    context.startActivity(intent);
                }
            });


        }
    }
}
