package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    
    int count=0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btnT);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Toast!",Toast.LENGTH_LONG).show();
            }
        });
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button1 = (Button) findViewById(R.id.btnCount);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                String s = String.valueOf(count);
                textView.setText(s);
            }
        });
    }
}