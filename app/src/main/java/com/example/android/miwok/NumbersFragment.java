package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class NumbersFragment extends Fragment {
    private ListView listView;
    private TextView textView;

    public NumbersFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_numbers,container,false);



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

        // WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
        CustomerListAdapter adapter = new CustomerListAdapter(getActivity(),R.layout.numbers_view_layout,numberList);
        adapter.setMcolor(R.color.category_numbers);
        ListView list_numbers_View = (ListView) view.findViewById(R.id.fragment_view_numbers);
        list_numbers_View.setAdapter(adapter);




        return view;
    }

}
