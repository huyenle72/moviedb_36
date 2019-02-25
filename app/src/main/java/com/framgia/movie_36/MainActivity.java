package com.framgia.movie_36;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        //Create UpComing Tab
        TabSpec photospec = tabHost.newTabSpec("UpComing");
        //Setting Image
        photospec.setIndicator("UpComing");
        //Content Tab UpComing
        Intent photosIntent = new Intent(this, UpComingActivity.class);
        photospec.setContent(photosIntent);

        //Create Playing Tab
        TabSpec songspec = tabHost.newTabSpec("Playing");
        songspec.setIndicator("Playing");
        Intent songsIntent = new Intent(this, PlayingActivity.class);
        songspec.setContent(songsIntent);

        //Create Popular Tab
        TabSpec videospec = tabHost.newTabSpec("Popular");
        videospec.setIndicator("Popular");
        Intent videosIntent = new Intent(this, PopularActivity.class);
        videospec.setContent(videosIntent);

        //Add TabSpec in TabHost
        tabHost.addTab(photospec); //Add Tab UpComing
        tabHost.addTab(songspec); //Add Tab Playing
        tabHost.addTab(videospec); //Add Tab Popular


    }
}
