package com.example.foody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class GridViewAdapter extends ArrayAdapter<ListViewBean_1> {

    public GridViewAdapter(@NonNull Context context, int resource, @NonNull List<ListViewBean_1> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (null == v){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list, null);
        }
        ListViewBean_1 product = getItem(position);
        ImageView img = (ImageView) v.findViewById(R.id.h);
        TextView txtTitle = (TextView) v.findViewById(R.id.t1);
        TextView txtCmt = (TextView) v.findViewById(R.id.t2);

        img.setImageResource(product.getImage());
        txtTitle.setText(product.getLangTitle());
        txtCmt.setText(product.getComment());

        return v;
    }
}
