package com.example.mikhail.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mikhail on 21.05.2015.
 */

/**
 * Custom adapter for ListView
 */
public class SimpleAdapter extends ArrayAdapter<ItemInfo> {

    // This class represent fileds
    // Класс для использования ViewHolder
    static class ViewHolder {
        TextView nameOfItem;
        TextView descriptionOfItem;
        ImageView image;
    }

    public SimpleAdapter (Context context, List<ItemInfo> values){
        super(context,R.layout.simple_list_item,values);
         }



    // This way how to fill our list item
    // If you want to know how to use ViewHolder pattern see below
    // Простой пример как наполнить наш элемент данными
    // Чуть ниже закомментирован способо,использующий паттерн ViewHolder
    // Его применение полезно когда много элементов, (1000-10000)
    @Override
    public View getView (int position,View convertView,ViewGroup parent){

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item,parent,false);
        TextView nameOfItem = (TextView)convertView.findViewById(R.id.big_list_item_title);
        TextView descriptionOfItem = (TextView)convertView.findViewById(R.id.big_list_item_details);
        ImageView image = (ImageView)convertView.findViewById(R.id.big_list_item_image_view);

        nameOfItem.setText(getItem(position).title);
        descriptionOfItem.setText(getItem(position).description);
        image.setImageResource(R.mipmap.ic_launcher);

        return convertView;
    }


    // This way show how to use ViewHolder pattern
//    @Override
//    public View getView (int position,View convertView,ViewGroup parent){
//
//        ViewHolder viewHolder;
//
//        if (convertView == null){
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item,parent,false);
//            viewHolder = new ViewHolder();
//
//            viewHolder.nameOfItem = (TextView)convertView.findViewById(R.id.big_list_item_title);
//            viewHolder.descriptionOfItem = (TextView)convertView.findViewById(R.id.big_list_item_details);
//            viewHolder.image = (ImageView)convertView.findViewById(R.id.big_list_item_image_view);
//            convertView.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder)convertView.getTag();
//        }
//
//        viewHolder.nameOfItem.setText(values[position]);
//       // viewHolder.descriptionOfItem.setText(values[position].description);
//        viewHolder.image.setImageResource(R.mipmap.ic_launcher);
//
//        return convertView;
//    }

}
