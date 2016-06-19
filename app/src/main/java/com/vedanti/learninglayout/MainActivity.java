package com.vedanti.learninglayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button_1);
        t1= (TextView) findViewById(R.id.change);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                t1.setText("last seen 49 minutes ago.");
                Toast.makeText(MainActivity.this,"button clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
