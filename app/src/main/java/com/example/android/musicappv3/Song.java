package com.example.android.musicappv3;

/**
 * Created by huosh on 4/7/2018.
 */

public class Song {
    /** Default translation for the word */
    private String mAlbumName;

    /** Miwok translation for the word */
    private String mSongName;

    /**
     * Create a new Word object.
     *
     * @param albumName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param songName is the word in the Miwok language
     */
    public Song(String albumName, String songName) {
        mAlbumName = albumName;
        mSongName = songName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getSongName() {
        return mSongName;
    }



}
