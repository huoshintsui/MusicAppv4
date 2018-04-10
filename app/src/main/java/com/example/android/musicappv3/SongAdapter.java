package com.example.android.musicappv3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.musicappv3.R;

import java.util.ArrayList;

/**
 * Created by huosh on 4/7/2018.
 */

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, ArrayList<Song> pWords) {
        super(context,0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song my_word= (Song) getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(my_word.getSongName());
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText(my_word.getAlbumName());

        return listItemView;
        //return super.getView(position, convertView, parent);
    }
}
