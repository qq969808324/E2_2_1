package com.example.e2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import  android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt =(TextView)findViewById(R.id.textView1);
        btn =(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        public void onClick(View v)
        {
            MainActivity.this.setTitle(R.string.app_name1);
            txt.setText(R.string.hello1);
        }
    }
}
