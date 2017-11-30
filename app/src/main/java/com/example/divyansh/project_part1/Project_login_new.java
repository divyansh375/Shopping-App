package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class Project_login_new extends AppCompatActivity {

    private EditText e1,e2;
    private Button submit,sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_login_new);

        fxn1();
    }

    public void fxn1()
    {
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText5);
        submit=(Button)findViewById((R.id.button));
        sign_up=(Button)findViewById(R.id.button3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().toString().equals("Name") && e2.getText().toString().equals("Name") )
                {
                    Intent i=new Intent(getApplicationContext(),Project_after_login.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Project_sign_up.class);
                startActivity(i);
            }
        });
        }



    }

