package com.example.bmicalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerContactAdapter extends RecyclerView.Adapter<recyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList <contactModel> arrContacts;
    ChatOnEachCardClick oneachcardclick;
    recyclerContactAdapter (Context context, ArrayList<contactModel> arrContacts, ChatOnEachCardClick oneachcardclick){
        this.context = context;
        this.arrContacts = arrContacts;
        this.oneachcardclick = oneachcardclick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view =  LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
       ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    holder.imgContact.setImageResource(arrContacts.get(position).img);
    holder.txtName.setText(arrContacts.get(position).name);
    holder.txtNumber.setText(arrContacts.get(position).contactNumber);
    holder.txtStatus.setText(arrContacts.get(position).status);

    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            oneachcardclick.onItemClicked(arrContacts.get(position));
        }
    });

    }

    @Override
    public int getItemCount() {
            return arrContacts.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;

        TextView txtName, txtNumber, txtStatus;
        ImageView imgContact;
        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.textName);
            txtNumber = itemView.findViewById(R.id.textNumber);
            txtStatus = itemView.findViewById(R.id.txtStatus);
            imgContact = itemView.findViewById(R.id.imgContact);
            cardView =itemView.findViewById(R.id.oneCard);
        }
    }
}
