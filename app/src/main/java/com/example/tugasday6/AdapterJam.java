package com.example.tugasday6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterJam extends RecyclerView.Adapter<AdapterJam.ViewHolder> {

    private ArrayList<MerkJam> merkjam;
    private OnItemClickListener listener;

    public AdapterJam(ArrayList<MerkJam> merkjam) {
        this.merkjam = merkjam;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MerkJam currentJam = merkjam.get(position);
        holder.namaJam.setText(currentJam.getNamaJam());
        holder.gambarJam.setImageResource(currentJam.getGambarJam());
    }

    @Override
    public int getItemCount() {
        return merkjam.size();
    }

    public interface OnItemClickListener {
        void onItemClick(MerkJam merk);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView namaJam;
        ImageView gambarJam;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaJam = itemView.findViewById(R.id.merk_jam);
            gambarJam = itemView.findViewById(R.id.gambar_jam);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION && listener != null) {
                listener.onItemClick(merkjam.get(position));
            }
        }
    }
}
