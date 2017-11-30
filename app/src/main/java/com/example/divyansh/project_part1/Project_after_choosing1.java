package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;
import android.view.View;

public class Project_after_choosing1 extends AppCompatActivity {
    private CheckBox c1,c2;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_after_choosing1);
        fxn4();
    }
    public void fxn4()
    {
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        submit=(Button)findViewById((R.id.button));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.isChecked())
                {
                    Intent i=new Intent(getApplicationContext(),Project_Bill.class);
                    i.putExtra("x","200 rs");
                    startActivity(i);
                }
                else if(c2.isChecked())
                {
                    Intent i=new Intent(getApplicationContext(),Project_Bill.class);
                    i.putExtra("x","400 rs");
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"please choose anyone one",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
