package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ColorsFragment extends Fragment {
    private ListView listView;
    private TextView textView;

    public ColorsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_color,container,false);


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

        // WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
        CustomerListAdapter adapter = new CustomerListAdapter(getActivity(),R.layout.colors_view_layout,colors);
        adapter.setMcolor(R.color.category_colors);
        ListView list_color_View = (ListView) view.findViewById(R.id.fragment_view_Color);
        list_color_View.setAdapter(adapter);

        return view;
    }

}
