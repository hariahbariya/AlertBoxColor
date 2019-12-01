package com.example.admin.alertboxcolor;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mDoneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDoneButton = (Button) findViewById(R.id.done_button);
        mDoneButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        final String[] colors = {"red", "green", "yellow","black"};

        final RelativeLayout rr=(RelativeLayout)findViewById(R.id.ll);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Make your selection");

       builder.setItems(colors, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

               String c=colors[i].toString();
               rr.setBackgroundColor(Color.parseColor(c));
           }
       });


        AlertDialog alert = builder.create();
        alert.show();
    }
}

