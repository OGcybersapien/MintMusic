package xyz.cybersapien.mintmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class playlistDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_detail);
    }

    public void goToSongDetail(View view){
        Intent songDetailIntent = new Intent(this, SongDetails.class);
        startActivity(songDetailIntent);
    }
}
