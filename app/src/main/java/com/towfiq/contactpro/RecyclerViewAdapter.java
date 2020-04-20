package com.towfiq.contactpro;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<ContactModel> mData;
    Dialog dialog;
    CallInterface callInterface;
    public RecyclerViewAdapter(Context context, List<ContactModel> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view_layout, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        //Dialog ini
        dialog=new Dialog(context);
        dialog.setContentView(R.layout.dialog_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //Call btn
        myViewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phnNumber=mData.get(myViewHolder.getAdapterPosition()).getNumber();
                callInterface = (CallInterface) context;
                callInterface.callBtn(phnNumber);
                Log.e(TAG, "onClick: ");
                Toast.makeText(context, phnNumber, Toast.LENGTH_SHORT).show();
            }
        });

        //Dialog
        myViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name=dialog.findViewById(R.id.dialog_name_id);
                TextView dialog_number=dialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_image=dialog.findViewById(R.id.dialog_img_id);

                dialog_name.setText(mData.get(myViewHolder.getAdapterPosition()).getName());
                dialog_number.setText(mData.get(myViewHolder.getAdapterPosition()).getNumber());
                dialog_image.setImageResource(mData.get(myViewHolder.getAdapterPosition()).getImage());
                dialog.show();
            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(mData.get(position).getName());
        holder.number.setText(mData.get(position).getNumber());
        holder.image.setImageResource(mData.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView number;
        private ImageView image;
        RelativeLayout relativeLayout;
        //
        private ImageButton button;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameID);
            number = itemView.findViewById(R.id.numberID);
            image = itemView.findViewById(R.id.imageID);
            relativeLayout=itemView.findViewById(R.id.child_layout_id);
            button = itemView.findViewById(R.id.call_icon_ID);
        }
    }

    //interface for Call Button
    interface CallInterface {
        void callBtn(String phoneNumber);
    }
}
