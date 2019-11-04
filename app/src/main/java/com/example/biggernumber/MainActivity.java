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
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Global variables
    private int count = 0;
    private int livesCount = 3;
    private int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        generateRand();
    }

    private void generateRand(){
        //Generate random numbers
        Random rand = new Random();
        n1 = rand.nextInt(10);
        n2 = rand.nextInt(10);

        //Defining buttons
        Button b1 = findViewById(R.id.num1);
        Button b2 = findViewById(R.id.num2);

        //Change the buttons' text to the random number.
        b1.setText(Integer.toString(n1));
        b2.setText(Integer.toString(n2));
    }


    //Methods for each button

    public void on_ClickLeft(View view) {
        if(n1 > n2){
            count++;
            Toast.makeText(getApplicationContext(), "Congratulations! That's correct!", Toast.LENGTH_SHORT).show();
        }
        else if(n1 == n2){
            count++;
            Toast.makeText(getApplicationContext(), "They're equal, correct!", Toast.LENGTH_SHORT).show();
        }
        else{
            livesCount--;
            if(livesCount == 0){
                Toast.makeText(getApplicationContext(), "Game Over", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Sorry, that's not correct.", Toast.LENGTH_SHORT).show();
            }
        }

        TextView tv = findViewById(R.id.tvPoints);
        tv.setText("Points: "+count);
        TextView tv2 = findViewById(R.id.tvLives);
        tv2.setText("Lives: "+livesCount);
        generateRand();
    }

    public void on_ClickRight(View view){
        if(n1 < n2){
            count++;
            Toast.makeText(getApplicationContext(), "Congratulations! That's correct!", Toast.LENGTH_SHORT).show();
        }
        else if(n2 == n1){
            count++;
            Toast.makeText(getApplicationContext(), "They're equal, correct!", Toast.LENGTH_SHORT).show();
        }
        else{
            livesCount--;
            if(livesCount == 0){
                Toast.makeText(getApplicationContext(), "Game Over", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Sorry, that's not correct.",Toast.LENGTH_SHORT).show();
            }
        }

        TextView tv = findViewById(R.id.tvPoints);
        tv.setText("Points: "+count);
        TextView tv2 = findViewById(R.id.tvLives);
        tv2.setText("Lives: "+livesCount);
        generateRand();
    }
}
