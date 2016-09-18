package xyz.cybersapien.mintmusic;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNowPlaying(View v){
        Intent nowPlayingIntent = new Intent(this,NowPlaying.class);
        //We'll need to add some data to the nowPlayingIntent as and when required use .setData() Method.
        startActivity(nowPlayingIntent);
    }

    public void goToPlayListDetails(View view){
        Intent playlistIntent = new Intent(this, playlistDetail.class);
        //Pass the name of the playlist using .setData() method
        startActivity(playlistIntent);
    }

    public void goToMyAccount(View v){
        Intent myAccountIntent = new Intent(this, myaccount.class);
        startActivity(myAccountIntent);
    }
}
