package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Word red            = new Word("red", "weṭeṭṭi",R.drawable.color_red);
        Word green          = new Word("green", "chokokki",R.drawable.color_green);
        Word brown          = new Word("brown", "ṭakaakki",R.drawable.color_brown);
        Word gray           = new Word("gray", "ṭopoppi",R.drawable.color_gray);
        Word black          = new Word("black", "kululli",R.drawable.color_black);
        Word white          = new Word("white", "kelelli",R.drawable.color_white);
        Word dusty_yellow   = new Word("dusty_yellow", "ṭopiisә",R.drawable.color_dusty_yellow);
        Word mustard_yellow = new Word("mustard_yellow", "chiwiiṭә",R.drawable.color_mustard_yellow);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(red);
        colors.add(green);
        colors.add(brown);
        colors.add(gray);
        colors.add(black);
        colors.add(white);
        colors.add(dusty_yellow);
        colors.add(mustard_yellow);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_color);

        ListView list_color_View = (ListView) findViewById(R.id.fragment_view_Color);
        CustomerListAdapter adapter = new CustomerListAdapter(this,R.layout.adapter_view_layout,colors);
        list_color_View.setAdapter(adapter);

    }
}
