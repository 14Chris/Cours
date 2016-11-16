package com.example.a14chris.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SmonTexte = (TextView)findViewById(R.id.text);
        monTexte.setText("Le texte de notre TextView");
    }

