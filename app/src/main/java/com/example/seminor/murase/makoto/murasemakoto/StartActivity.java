package com.example.seminor.murase.makoto.murasemakoto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity  extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button1:
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
