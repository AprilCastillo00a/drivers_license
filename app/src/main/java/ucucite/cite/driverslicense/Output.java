package ucucite.cite.driverslicense;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    ImageView displayID;
    TextView displayName;
    TextView displayNationality;
    TextView displaySex;
    TextView displayDate;
    TextView displayWeight;
    TextView displayHeight;
    TextView displayAddress;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        displayID = findViewById(R.id.displayID);
        displayName = findViewById(R.id.displayName);
        displayNationality = findViewById(R.id.displayNationality);
        displaySex = findViewById(R.id.displaySex);
        displayDate = findViewById(R.id.displayDate);
        displayWeight = findViewById(R.id.displayWeight);
        displayHeight = findViewById(R.id.displayHeight);
        displayAddress = findViewById(R.id.displayAddress);
        button2 = findViewById(R.id.button2);



        String names = getIntent().getStringExtra("NAME");
        Intent intent = getIntent();


        ImageView displayID = (ImageView) findViewById(R.id.displayID);

        if(names.equalsIgnoreCase("Opeña, Jennifer B")){
            displayID.setBackgroundResource(R.drawable.pic_1);
            String name = intent.getStringExtra("NAME");
            displayName.setText(name);
            String codes = intent.getStringExtra("CODE");
            displayNationality.setText(codes);
            String gen = intent.getStringExtra("SEX");
            displaySex.setText(gen);
            String date = intent.getStringExtra("DATE");
            displayDate.setText(date);
            String taba = intent.getStringExtra("TABA");
            displayWeight.setText(taba);
            String taas = intent.getStringExtra("TAAS");
            displayHeight.setText(taas);
            String add = intent.getStringExtra("ADD");
            displayAddress.setText(add);

        }else if(names.equalsIgnoreCase("Doton, Jassy C.")){
            displayID.setBackgroundResource(R.drawable.pic_2);
            String name = intent.getStringExtra("NAME");
            displayName.setText(name);
            String codes = intent.getStringExtra("CODE");
            displayNationality.setText(codes);
            String gen = intent.getStringExtra("SEX");
            displaySex.setText(gen);
            String date = intent.getStringExtra("DATE");
            displayDate.setText(date);
            String taba = intent.getStringExtra("TABA");
            displayWeight.setText(taba);
            String taas = intent.getStringExtra("TAAS");
            displayHeight.setText(taas);
            String add = intent.getStringExtra("ADD");
            displayAddress.setText(add);

        } else if(names.equalsIgnoreCase("Nolledo, Mary Joy P.")){
            displayID.setBackgroundResource(R.drawable.pic_3);
            String name = intent.getStringExtra("NAME");
            displayName.setText(name);
            String codes = intent.getStringExtra("CODE");
            displayNationality.setText(codes);
            String gen = intent.getStringExtra("SEX");
            displaySex.setText(gen);
            String date = intent.getStringExtra("DATE");
            displayDate.setText(date);
            String taba = intent.getStringExtra("TABA");
            displayWeight.setText(taba);
            String taas = intent.getStringExtra("TAAS");
            displayHeight.setText(taas);
            String add = intent.getStringExtra("ADD");
            displayAddress.setText(add);

        }else if(names.equalsIgnoreCase("Castillo April Joy A.")){
            displayID.setBackgroundResource(R.drawable.pic_4);
            String name = intent.getStringExtra("NAME");
            displayName.setText(name);
            String codes = intent.getStringExtra("CODE");
            displayNationality.setText(codes);
            String gen = intent.getStringExtra("SEX");
            displaySex.setText(gen);
            String date = intent.getStringExtra("DATE");
            displayDate.setText(date);
            String taba = intent.getStringExtra("TABA");
            displayWeight.setText(taba);
            String taas = intent.getStringExtra("TAAS");
            displayHeight.setText(taas);
            String add = intent.getStringExtra("ADD");
            displayAddress.setText(add);

        }


    }

    public void btnFunction (View view)
    {
        Intent exit = new Intent(this, MainActivity.class);
        startActivity(exit);
    }
}