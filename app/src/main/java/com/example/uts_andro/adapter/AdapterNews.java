package com.example.uts_andro.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.uts_andro.R;
import com.example.uts_andro.model.NewsModel;
import com.squareup.picasso.Picasso;

public class AdapterNews extends ArrayAdapter<NewsModel> {

    int resource;
    Context context;


    public AdapterNews(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    class Holder{
        ImageView imgNews;
        TextView txtTitle, txtContent;
    }
    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Holder holder;
        NewsModel model = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(resource,parent,false);
            holder = new Holder();
            holder.imgNews= convertView.findViewById(R.id.imgNews);
            holder.txtTitle = convertView.findViewById(R.id.txtTitle);
            holder.txtContent = convertView.findViewById(R.id.txtContent);
            convertView.setTag(holder);
        }else {
            holder = (Holder) convertView.getTag();
        }
        Picasso.get().load(model.getImage()).into(holder.imgNews);
        Log.e(this.context.toString(), model.getImage().toString());
        holder.txtTitle.setText(model.getTxtTitle());
        String isiBerita = model.getTxtContent();
        String isiBeritaPendek = isiBerita.substring(0,50);
        holder.txtContent.setText(isiBeritaPendek);

        return convertView;
    }


}
