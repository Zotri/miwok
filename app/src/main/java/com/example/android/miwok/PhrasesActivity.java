package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Word phrase1  = new Word("Where are you going?", "minto wuksus",R.drawable.family_grandfather);
        Word phrase2  = new Word("What is your name?", "tinnә oyaase'nә",R.drawable.family_son);
        Word phrase3  = new Word("My name is...", "oyaaset...",R.drawable.number_one);
        Word phrase4  = new Word("How are you feeling?", "michәksәs?",R.drawable.color_brown);
        Word phrase5  = new Word("I’m feeling good.", "kuchi achit",R.drawable.color_red);
        Word phrase6  = new Word("Are you coming?","әәnәs'aa?",R.drawable.color_green);
        Word phrase7  = new Word("Yes, I’m coming.", "hәә’әәnәm",R.drawable.family_younger_sister);
        Word phrase8  = new Word("I’m coming.", "әәnәm",R.drawable.family_mother);
        Word phrase9  = new Word("Let’s go.", "yoowutis",R.drawable.family_son);
        Word phrase10 = new Word("Come here." , "әnni'nem",R.drawable.color_white);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(phrase1);
        colors.add(phrase2);
        colors.add(phrase3);
        colors.add(phrase4);
        colors.add(phrase5);
        colors.add(phrase6);
        colors.add(phrase7);
        colors.add(phrase8);
        colors.add(phrase9);
        colors.add(phrase10);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_phrases);

        ListView List_color_View = (ListView) findViewById(R.id.fragment_view_phrases);
        CustomerListAdapter adapter = new CustomerListAdapter(this,R.layout.adapter_view_layout,colors);
        List_color_View.setAdapter(adapter);
    }
}
