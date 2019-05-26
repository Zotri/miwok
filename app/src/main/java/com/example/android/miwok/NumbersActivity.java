package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Word eins  = new Word("Eins","lutti",R.drawable.number_one);
        Word zwei  = new Word("zwei","otiiko",+R.drawable.number_two);
        Word drei  = new Word("drei","tolookosu",R.drawable.number_three);
        Word fier  = new Word("fier","oyyisa",R.drawable.number_four);
        Word fuenf = new Word("fuenf","massokka",R.drawable.number_five);
        Word sechs = new Word("sechs","temmokka",R.drawable.number_six);
        Word sieben= new Word("sieben","kenekaku",R.drawable.number_seven);
        Word acht  = new Word("acht","kawinta",R.drawable.number_eight);
        Word neuen = new Word("neuen","wo’e",R.drawable.number_nine);
        Word zehn  = new Word("zehn","na’aacha",R.drawable.number_ten);
        Word eleven = new Word("eleven","ke˙nghe˙ṭiya:ku",R.drawable.number_one);
        Word twelve = new Word("twelve","‘oṭikshake˙nu",R.drawable.number_two);

        ArrayList<Word> numberList = new ArrayList<>();
        numberList.add(eins);
        numberList.add(zwei);
        numberList.add(drei);
        numberList.add(fier);
        numberList.add(fuenf);
        numberList.add(sechs);
        numberList.add(sieben);
        numberList.add(acht);
        numberList.add(neuen);
        numberList.add(zehn);
        numberList.add(eleven);
        numberList.add(twelve);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_numbers);
        ListView mListView = (ListView) findViewById(R.id.fragment_view_numbers);
        CustomerListAdapter adapter = new CustomerListAdapter(this,R.layout.adapter_view_layout,numberList);
        mListView.setAdapter(adapter);



    }
}

