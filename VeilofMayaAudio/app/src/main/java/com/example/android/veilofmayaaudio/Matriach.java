package com.example.android.veilofmayaaudio;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.widget.Toast;

public class Matriach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriach);

        // return button
        Button home = (Button) findViewById(R.id.retM);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Matriach.this, Albums.class);
                startActivity(homeIntent);
            }
        });
        // album contents pending
        TextView CS1 = (TextView) findViewById(R.id.matSong);
        CS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Matriach.this,
                        "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
// Set the content of the activity to use the activity_main.xml layout file

