package com.example.mordiggian.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements TopFragment.TopFragmentListener{


    public void generateMeme(String topString,String bottomString){
        BottomFragment bottomFragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(topString, bottomString);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
