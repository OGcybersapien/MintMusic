package xyz.cybersapien.mintmusic;

import android.content.Intent;
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
        Intent intent = new Intent(this,NowPlaying.class);
        //We'll need to add some data to the intent as and when required use .setData() Method.
        startActivity(intent);
    }
}
