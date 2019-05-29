package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class PhrasesFragment extends Fragment {
    private ListView listView;
    private TextView textView;
    private int imagid = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =0;

    public PhrasesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_phrases,container,false);

        Word phrase1  = new Word("Where are you going?", "minto wuksus",imagid);
        Word phrase2  = new Word("What is your name?", "tinnә oyaase'nә",imagid);
        Word phrase3  = new Word("My name is...", "oyaaset...",imagid);
        Word phrase4  = new Word("How are you feeling?", "michәksәs?",imagid);
        Word phrase5  = new Word("I’m feeling good.", "kuchi achit",imagid);
        Word phrase6  = new Word("Are you coming?","әәnәs'aa?",imagid);
        Word phrase7  = new Word("Yes, I’m coming.", "hәә’әәnәm",imagid);
        Word phrase8  = new Word("I’m coming.", "әәnәm",imagid);
        Word phrase9  = new Word("Let’s go.", "yoowutis",imagid);
        Word phrase10 = new Word("Come here." , "әnni'nem",imagid);

        ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(phrase1);
        phrases.add(phrase2);
        phrases.add(phrase3);
        phrases.add(phrase4);
        phrases.add(phrase5);
        phrases.add(phrase6);
        phrases.add(phrase7);
        phrases.add(phrase8);
        phrases.add(phrase9);
        phrases.add(phrase10);

        // WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
        CustomerListAdapter adapter = new CustomerListAdapter(getActivity(),R.layout.phrases_view_layout,phrases);
        adapter.setMcolor(R.color.category_phrases);

        ListView list_phrases_View = (ListView) view.findViewById(R.id.fragment_view_phrases);
        list_phrases_View.setAdapter(adapter);

        return view;
    }

}
