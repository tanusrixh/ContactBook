package com.example.contactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    private ListView displayContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dispInfo();
        setContactExtra();

    }

    private void dispInfo(){
        displayContact = findViewById(R.id.contactsView);
    }

    public void newContact(View view){

    }

    private void setContactExtra(){
        ContactExtra contactview = new ContactExtra(getApplicationContext(), ContactsInfo.contacts);
        displayContact.setAdapter(contactview);
    }


}