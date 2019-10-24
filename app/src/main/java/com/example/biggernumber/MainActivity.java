package com.example.biggernumber;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Defining buttons
        Button first_n = findViewById(R.id.num1);
        Button second_n = findViewById(R.id.num2);

        //Setting them to listen for a click
        first_n.setOnClickListener(this);
        second_n.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        //Switch for the different buttons
        switch (v.getId()){
            case R.id.num1:
                generate_num1();
                break;
            case R.id.num2:
                generate_num2();
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }

    public void generate_num1(){
        TextView tv = findViewById(R.id.textView);
        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));
    }

    public void generate_num2(){
        TextView tv2 = findViewById(R.id.textView2);
        Random r = new Random();
        int number = r.nextInt(6);
        tv2.setText(Integer.toString(number));
    }
}
