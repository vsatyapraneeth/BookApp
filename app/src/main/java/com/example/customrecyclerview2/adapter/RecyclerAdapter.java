package com.example.customrecyclerview2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.customrecyclerview2.R;
import com.example.customrecyclerview2.model.RecyclerModel;

import java.util.List;



public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    List<RecyclerModel> recyclerModels;

    public RecyclerAdapter(Context context,List<RecyclerModel> recyclerModels){
        this.context = context;
        this.recyclerModels = recyclerModels;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtDate.setText(recyclerModels.get(position).getDate());
        holder.txtTitle.setText(recyclerModels.get(position).getTitle());
        holder.txtDescription.setText(recyclerModels.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return recyclerModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtDate, txtTitle, txtDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDate = itemView.findViewById(R.id.txt_date);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDescription = itemView.findViewById(R.id.txt_description);


        }
    }
}

