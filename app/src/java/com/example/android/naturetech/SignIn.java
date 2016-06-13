package com.example.android.naturetech;

import android.support.v7.app.*;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class SignIn extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);


        b= (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignIn.this, Home.class);
                startActivity(i);


            }
        });


    }
}
