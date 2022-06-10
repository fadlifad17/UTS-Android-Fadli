package com.example.uts_andro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.uts_andro.R;
import com.example.uts_andro.model.AlumniModel;

public class AdapterDataAlumni extends ArrayAdapter<AlumniModel> {

    int resource;
    Context context;

    public AdapterDataAlumni(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    class Holder{
        TextView txtNim, txtNama;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       Holder holder;
       AlumniModel model = getItem(position);

       if (convertView==null){
           convertView = LayoutInflater.from(context).inflate(resource, parent, false);
           holder = new Holder();
           holder.txtNim = convertView.findViewById(R.id.txtNim);
           holder.txtNama = convertView.findViewById(R.id.txtNama);
           convertView.setTag(holder);
       }else {
           holder = (Holder) convertView.getTag();
       }

        holder.txtNim.setText(model.getNim());
        holder.txtNama.setText(model.getNama());

        return convertView;
    }
}
