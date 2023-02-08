package com.example.contactbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactExtra extends ArrayAdapter<ContactsInfo>{

    public ContactExtra(@NonNull Context context, @NonNull List<ContactsInfo> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ContactsInfo contact = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell,parent,false);
        }

        TextView fName = convertView.findViewById(R.id.fTitle);
        TextView lName = convertView.findViewById(R.id.lTitle);

        fName.setText(contact.getFName());
        lName.setText(contact.getLName());

        return convertView;
    }
}
