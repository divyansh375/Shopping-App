package com.example.divyansh.project_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;


public class Project_after_choosing extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    Button submit;
    EditText e1;
    int y=0;
    String str1;
    String str="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_after_choosing);
        fxn3();
    }
    public void fxn3()
    {
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox4);
        e1=(EditText)findViewById(R.id.editText2);

        submit=(Button)findViewById((R.id.button));


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.isChecked())
                {
                    str=str+"jeans";
                    y=y+200;
                }
                if(c2.isChecked())
                {
                    str=str+"t-shirt";
                 y=y+1000;
                }
                if(c3.isChecked())
                {
                    str=str+"shirt";
                    y=y+500;
                }
                if(c4.isChecked())
                {
                    str=str+"jacket";
                    y=y+600;
                }
                str1=e1.getText().toString();
                Intent i=new Intent(getApplicationContext(),Project_Bill.class);
                i.putExtra("x",Integer.toString(y));
                i.putExtra("str",str);
                i.putExtra("e1",str1);
                startActivity(i);
            }
        });
    }

}
