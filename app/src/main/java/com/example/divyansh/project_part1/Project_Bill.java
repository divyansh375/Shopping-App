package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Project_Bill extends AppCompatActivity {
    private TextView v1;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_project__bill);
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        final DatabaseReference nref= database.getReference("details");
        final DatabaseReference nrefChild=nref.child("Name");
        Bundle extras=getIntent().getExtras();
        String v=extras.getString("x");
        String str=extras.getString("str");
        String e1=extras.getString("e1");
        String fin="bill:"+v+"products:"+str+"address:"+e1;

        nref.push().setValue(fin);


        v1=(TextView)findViewById(R.id.textView);
        v1.setText("Total amount: "+v+"\n your products will be delivered soon. \n Thank you !!");
    }
}
