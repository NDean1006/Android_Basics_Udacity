package com.example.android.veilofmayaaudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_albums);
        LinearLayout matriach = (LinearLayout) findViewById(R.id.matriach);
        matriach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent matriachIntent = new Intent(Albums.this, Matriach.class);
                startActivity(matriachIntent);
            }
        });
        LinearLayout eclipse = (LinearLayout) findViewById(R.id.eclipse);
        eclipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eclipseIntent = new Intent(Albums.this, Eclipse.class);
                startActivity(eclipseIntent);
            }
        });
        LinearLayout iD = (LinearLayout) findViewById(R.id.id_button);
        iD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDIntent = new Intent(Albums.this, ID.class);
                startActivity(iDIntent);
            }
        });
        LinearLayout theCommon = (LinearLayout) findViewById(R.id.the_common);
        theCommon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theCommonIntent = new Intent(Albums.this, TheCommonMansCollapse.class);
                startActivity(theCommonIntent);
            }
        });
    }
}


