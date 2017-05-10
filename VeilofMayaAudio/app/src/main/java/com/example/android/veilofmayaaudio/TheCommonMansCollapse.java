package com.example.android.veilofmayaaudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TheCommonMansCollapse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_common_mans_collapse);

        // return button
        Button home = (Button) findViewById(R.id.retC);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(TheCommonMansCollapse.this, Albums.class);
                startActivity(homeIntent);
            }
        });
        // album contents pending
        TextView CS1 = (TextView) findViewById(R.id.CommSong);
        CS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TheCommonMansCollapse.this,
                        "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
