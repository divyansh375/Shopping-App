package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Project_sign_up extends AppCompatActivity {
    private EditText e1,e2,e3,e4;
    private Button b1;
    private CheckBox ch1;
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    final DatabaseReference nref= database.getReference("users");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_sign_up);
        b1=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById((R.id.editText3));
        e2=(EditText)findViewById((R.id.editText4));
        e3=(EditText)findViewById(R.id.editText6);
        e4=(EditText)findViewById(R.id.editText7);
        ch1=(CheckBox)findViewById(R.id.checkBox5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if(ch1.isChecked())
                {
                    if(e4.getText().toString().equals("Card number (if pay by card)"))
                    {
                        Toast.makeText(getApplicationContext(),"account has been created, but please give card number also",Toast.LENGTH_SHORT).show();
                    }
                }
                 if (e2.getText().toString().equals(e3.getText().toString()) && ch1.isChecked()) {


                    nref.push().setValue(e1.getText().toString());
                    nref.push().setValue((e2.getText().toString()));
                    Toast.makeText(getApplicationContext(), "you have successfully created your account", Toast.LENGTH_SHORT).show();


                }

                else  {
                    Toast.makeText(getApplicationContext(), "passwords dont match", Toast.LENGTH_SHORT).show();
                }
                }
            });
        };


    }

