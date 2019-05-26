package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Word father          = new Word("father", "әpә",R.drawable.family_father);
        Word mother          = new Word("mother", "әṭa",R.drawable.family_mother);
        Word son             = new Word("son", "angsi",R.drawable.family_son);
        Word daughter        = new Word("daughter", "tune",R.drawable.family_daughter);
        Word older_brother   = new Word("older brother", "taachi",R.drawable.family_older_brother);
        Word younger_brother = new Word("younger brother","chalitti",R.drawable.family_younger_brother);
        Word older_sister    = new Word("older sister" , "teṭe",R.drawable.family_older_sister);
        Word younger_sister  = new Word("younger sister" , "kolliti",R.drawable.family_younger_sister);
        Word grandmother     = new Word("grandmother" , "ama",R.drawable.family_grandmother);
        Word grandfather     = new Word("grandfather" , "paapa",R.drawable.family_grandfather);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(father);
        colors.add(mother);
        colors.add(son);
        colors.add(daughter);
        colors.add(older_brother);
        colors.add(younger_brother);
        colors.add(older_sister);
        colors.add(younger_sister);
        colors.add(grandmother);
        colors.add(grandfather);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_family);

        ListView List_color_View = (ListView) findViewById(R.id.fragment_view_family);
        CustomerListAdapter adapter = new CustomerListAdapter(this,R.layout.adapter_view_layout,colors);
        List_color_View.setAdapter(adapter);
    }
}
