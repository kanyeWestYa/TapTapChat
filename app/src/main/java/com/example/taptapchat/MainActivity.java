package com.example.taptapchat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;



public class MainActivity extends Activity {
    Button btnd;
    Button btna;
    Button btnb;
    Button btnc;

    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFirebase=new Firebase("https://testing-acec7.firebaseio.com/");
        Firebase.setAndroidContext(this);
        myListView = (ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> myArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item1,myArrayList);
        myFirebase.
        */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btna = (Button) findViewById(R.id.buttona);
        btnb = (Button) findViewById(R.id.buttonb);
        btnc = (Button) findViewById(R.id.buttonc);
        btnd = (Button) findViewById(R.id.buttond);

        buttonPop((Button)findViewById(R.id.button0));
        buttonPop((Button)findViewById(R.id.button1));
        buttonPop((Button)findViewById(R.id.button2));
        buttonPop((Button)findViewById(R.id.button3));
        buttonPop((Button)findViewById(R.id.button4));
        buttonPop((Button)findViewById(R.id.button5));
        buttonPop((Button)findViewById(R.id.button6));
        buttonPop((Button)findViewById(R.id.button7));
    }

    private void buttonPop(final Button b){
        b.setTextSize(12.0f);
        b.setTextColor(Color.WHITE);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createPopA(b.getText().toString(), b.getX(), b.getY());
                createPopB(b.getText().toString(), b.getX(), b.getY());
                createPopC(b.getText().toString(), b.getX(), b.getY());
                createPopD(b.getText().toString(), b.getX(), b.getY());
                writeFinal(b.getText());
            }
        });
    }


    static int xOff = 130;
    static int yOff = 120;


    private void createPopA(String parent, float x, float y) {
        btna.setX(x + xOff);
        btna.setY(y + yOff + 30);
        if (parent.equals("Action")) {
            btna.setText("Look");
        } else if (parent.equals("Question")){
            btna.setText("Who");
        }
        btna.setVisibility(View.VISIBLE);
    }

    private void createPopB(String parent, float x, float y) {
        btnb.setX(x + xOff);
        btnb.setY(y - yOff);
        btnb.setText("Come");
        btnb.setVisibility(View.VISIBLE);

    }

    private void createPopC(String parent, float x, float y) {
        btnc.setX(x - xOff);
        btnc.setY(y - yOff);
        btnc.setText("Walk");
        btnc.setVisibility(View.VISIBLE);

    }

    private void createPopD(String parent, float x, float y) {
        btnd.setX(x - xOff);
        btnd.setY(y + yOff + 30);
        btnd.setText("Run");
        btnd.setVisibility(View.VISIBLE);

    }

    private void writeFinal(String name){
    }
}

