package com.example.contactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ContactsEditor extends AppCompatActivity{

    private EditText first, last, phone, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_editor);
        initialInfo();
    }

    private void initialInfo(){
        first = findViewById(R.id.newFName);
        last = findViewById(R.id.newLName);
        phone = findViewById(R.id.newPhone);
        email = findViewById(R.id.newMail);
    }
    public void saveContact(View view){
        String firstName = String.valueOf(first.getText());
        String lastName = String.valueOf(last.getText());
        String emailID = String.valueOf(email.getText());
        String number = String.valueOf(phone.getText());

        int id = ContactsInfo.contacts.size();
        ContactsInfo newContacts = new ContactsInfo(id, firstName, lastName, number, emailID);
        ContactsInfo.contacts.add(newContacts);
        finish();
    }

    public void oldContact(View view) {
        Intent main = new Intent(ContactsEditor.this, MainActivity.class);
        startActivity(main);
    }
}
