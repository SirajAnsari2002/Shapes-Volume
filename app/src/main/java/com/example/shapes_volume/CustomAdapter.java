package com.example.shapes_volume;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Shape> {
    ArrayList<Shape> a1;
    Context context;

    public CustomAdapter(ArrayList<Shape> a1, Context context1) {
        super(context1 , R.layout.item_layout_file, a1);
        this.a1 = a1;
        this.context = context1;
    }

    private static class ViewHolder{
        ImageView imageView1;
        TextView textView1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape obj = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_layout_file,
                    parent,
                    false
            );
            viewHolder = new ViewHolder();
            viewHolder.imageView1 = (ImageView) convertView.findViewById(R.id.imageView);
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView);
            result = convertView;
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.textView1.setText(obj.getShape_name());
        viewHolder.imageView1.setImageResource(obj.getImage_source());
        return result;
    }
}
