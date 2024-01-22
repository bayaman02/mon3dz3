package com.classwork.mon3dz3;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_food);
    }

    @SuppressLint("ResourceAsColor")
    public void onBind(String food){
        if (food == "Шаурма")
            textView.setTextColor(R.color.white);
        textView.setText(food);
    }
}
