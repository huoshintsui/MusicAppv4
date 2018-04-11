package com.example.android.musicappv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by huosh on 4/8/2018.
 */

public class HowLovelyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of song
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Lord, Thou Art a Potter Skilled"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Where is the House"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "How Lovely is Thy Dwelling Place"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "I Know Your Works"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "God's Central Work and Purpose"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Thy Dwelling Place O Lord I Love"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Oneness"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "How Oft Believers Through the Years"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Oh How Sweet It is Just to Know My Christ"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "We Have Seen Christ as Reality"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Deeper, Deeper in the Cross of Jesus"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Jesus Lord, My Best Love Thou Art"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "Praise to the Lord, the Almighty"));
        songs.add(new Song("How Lovely is Thy Dwelling Place", "No Mortal Tongue"));

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Intent openMainActivity = new Intent(HowLovelyActivity.this, MainActivity.class);
                startActivity(openMainActivity);
            }
        });
    }
}