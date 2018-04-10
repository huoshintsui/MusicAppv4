package com.example.android.musicappv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.musicappv3.R;

import java.util.ArrayList;

/**
 * Created by huosh on 4/7/2018.
 */

public class OrdinaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of song
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Ordinary Days", "Preserve Me, O God"));
        songs.add(new Song("Ordinary Days", "In Order that the Blessing"));
        songs.add(new Song("Ordinary Days", "The Spirit of the Lord"));
        songs.add(new Song("Ordinary Days", "Nothing Between"));
        songs.add(new Song("Ordinary Days", "Ordinary Days"));
        songs.add(new Song("Ordinary Days", "And I said to Him"));
        songs.add(new Song("Ordinary Days", "But We All with Unveiled Face"));
        songs.add(new Song("Ordinary Days", "Where Jesus is, My Joy is There"));
        songs.add(new Song("Ordinary Days", "Make a Joyful Noise"));
        songs.add(new Song("Ordinary Days", "I Love You, Lord"));
        songs.add(new Song("Ordinary Days", "Consecration"));
        songs.add(new Song("Ordinary Days", "Fresh as the Dew"));
        songs.add(new Song("Ordinary Days", "We Rest on Thee"));
        songs.add(new Song("Ordinary Days", "Things Which Eye Has Not Seen"));
        songs.add(new Song("Ordinary Days", "Medley"));
        songs.add(new Song("Ordinary Days", "I Bow My Knees Unto the Father"));
        songs.add(new Song("Ordinary Days", "But to Him"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Song_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

    }
}