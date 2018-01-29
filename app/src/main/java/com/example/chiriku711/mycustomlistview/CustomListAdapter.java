package com.example.chiriku711.mycustomlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chiriku711 on 1/30/18.
 */

public class CustomListAdapter extends ArrayAdapter<String> {


    private Context context;
    private String[] data;
    private Integer[] images;

    public  CustomListAdapter(Context context , String[]data,Integer[]images){
        super(context,R.layout.my_list,data);

        this.context = context;
        this.data = data;
        this.images = images;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.my_list,null,true);

        ImageView imagesList = view.findViewById(R.id.image_list);
        TextView txtNameList = view.findViewById(R.id.txt_name);
        TextView txtDescList = view.findViewById(R.id.txt_desc);

        imagesList.setImageResource(images[position]);
        txtNameList.setText(data[position]);
        txtDescList.setText("Descripton "+ data[position]);

        return view;
    }
}
