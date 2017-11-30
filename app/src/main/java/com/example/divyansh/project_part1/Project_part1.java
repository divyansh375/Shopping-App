package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;



public class Project_part1 extends AppCompatActivity {
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_part1);
        Toast.makeText(getApplicationContext(),"Welcome user",Toast.LENGTH_SHORT).show();

        fxn();

    }

    public void fxn()
    {
        login=(Button)findViewById(R.id.button5);
        login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Project_login_new.class);
                startActivity(i);
            }
        });

    }
}
