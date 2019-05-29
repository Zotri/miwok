package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class FamilyFragment extends Fragment {
    private ListView listView;
    private TextView textView;

    public FamilyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_family,container,false);


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

        ArrayList<Word> family = new ArrayList<>();

        family.add(father);
        family.add(mother);
        family.add(son);
        family.add(daughter);
        family.add(older_brother);
        family.add(younger_brother);
        family.add(older_sister);
        family.add(younger_sister);
        family.add(grandmother);
        family.add(grandfather);

        // WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
        //        CustomerListAdapter adapter = new CustomerListAdapter(this,R.layout.adapter_view_layout,numberList);
        CustomerListAdapter adapter = new CustomerListAdapter(getActivity(),R.layout.family_view_layout,family);
        adapter.setMcolor(R.color.category_family);
        ListView list_family_View = (ListView) view.findViewById(R.id.fragment_view_family);
        list_family_View.setAdapter(adapter);

        return view;
    }

}
