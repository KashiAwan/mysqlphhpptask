package com.example.mysqlphhpptask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText namee,cntct,address;
    Button addbut,clrbutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namee = findViewById(R.id.namee);
        cntct = findViewById(R.id.cntctno);
        address = findViewById(R.id.addree);
        addbut = findViewById(R.id.addbutt);
        clrbutt = findViewById(R.id.clrbutt);



        addbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                namee.setText(ServerURLss.ADD_RECORD);

            }
        });
    }
}
