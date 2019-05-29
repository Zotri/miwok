package com.example.android.miwok;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerListAdapter extends ArrayAdapter<Word> {

    private static final String TAG = "CustomAdapter";
    private Context mContext;
    private Integer[] imgid;
    private int mcolor;
    private int mRessource;
    private int mColorResourceId;
    private int pos;

    public int getMcolor() {
        return mcolor;
    }

    public void setMcolor(int mcolor) {
        this.mcolor = mcolor;
    }
    Log log;
/**
 * Default constructor for the NumberListAdapter
 * @param context
 * @param resource
 * @param objects
 * */
    public CustomerListAdapter(Context context, int resource, ArrayList<Word> objects) {
        super(context, resource, objects);
        this.mContext = mContext;
        mRessource=resource;

    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent) {
        pos = position;
        // Check if an existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_view_layout, parent, false);
        }
        ViewHolder viewHolder= null;
        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textTranslation);
        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        LinearLayout layout = listItemView.findViewById(R.id.text_layout);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentWord.getWord());
        img.setImageResource(currentWord.getImagid());
        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textWord);
        layout.setBackgroundColor(mcolor);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getTranslation());
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.



        return listItemView;

    }

    private class ViewHolder{
        ImageView imgView;
        ViewHolder(View v){
            imgView= (ImageView) v.findViewById(R.id.image);
        }
    }

}
