package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button b1;
   private Button b2;
   private EditText ed1;
   private EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.pass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("food") && ed2.getText().toString().equals("food1"))
                {
                    Toast.makeText(getApplicationContext(),"redirecting",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
                ed2.setText("");
            }
        });
    }
}