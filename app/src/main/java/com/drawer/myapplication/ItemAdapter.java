package com.drawer.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

public class ItemAdapter extends BaseAdapter {
    //filed
    private Context context;
    private List<Item> itemList;
    private LayoutInflater inflater;


    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
       return itemList.size();
    }

    @Override
    public Item getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.adapter_item,null);

        Item currentItem = getItem(position);
        final String itemname = currentItem.getName();
        final String image = currentItem.getImage();
        final String description = currentItem.getDesciption();
        final double itemprice =  currentItem.getPrice();

        //get iten_name Textview ,itemprice,itemico

        TextView textViewitem_name = convertView.findViewById(R.id.item_name);
        TextView textViewitem_price = convertView.findViewById(R.id.item_price);
        ImageView imageViewitem_icon = convertView.findViewById(R.id.item_icon);
        Button voir = convertView.findViewById(R.id.btn_voir);
        String ressourceNme = image;
        final int ressourceId = context.getResources().getIdentifier(ressourceNme,"drawable",context.getPackageName());
        //set item_bname amd item price

        textViewitem_name.setText(itemname);
        textViewitem_price.setText(Double.toString(itemprice)+ " CFA");
        imageViewitem_icon.setImageResource(ressourceId);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(context,"Nom : "+itemname+"prix : "+Double.toString(itemprice),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context,Commandes.class);
                intent.putExtra("nom",itemname);
                intent.putExtra("price",itemprice);
                intent.putExtra("image",ressourceId);
                intent.putExtra("description",description);
                context.startActivity(intent);
            }
        });

        voir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Commandes.class);
                intent.putExtra("nom",itemname);
                intent.putExtra("price",itemprice);
                intent.putExtra("image",ressourceId);
                intent.putExtra("description",description);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
