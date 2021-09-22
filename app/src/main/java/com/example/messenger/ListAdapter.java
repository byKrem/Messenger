package com.example.messenger;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<User> {

    public ListAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext().getApplicationInfo());
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView userName = convertView.findViewById(R.id.name_profile);
        TextView userPhone = convertView.findViewById(R.id.phone_profile);
        TextView userCountry = convertView.findViewById(R.id.country_profile);
        return null;
    }
}
