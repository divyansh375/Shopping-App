package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;


public class Project_after_login extends AppCompatActivity {
    CheckBox c1,c2;
    Button submit1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_after_login);

        fxn2();
    }

    public void fxn2()
    {
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        submit1=(Button)findViewById(R.id.button);

        ;

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.isChecked())
                {
                    Intent i=new Intent(getApplicationContext(),Project_after_choosing.class);
                    startActivity(i);
                }
                else if(c2.isChecked())
                {
                    Intent i=new Intent(getApplicationContext(),Project_after_choosing1.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"please choose anyone",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
