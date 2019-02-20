package com.mractiveiddev.coffeekite;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.VideoView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acrivity_login);

        VideoView videoBG = (VideoView) findViewById(R.id.videoBG);

        Uri uri = Uri.parse("android.resource://"
                + getPackageName()
                + "/"
                + R.raw.coffeea);

        videoBG.setVideoURI(uri);
        videoBG.start();

        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }

    public void OnLogin(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    public void OnRegister(View view) {
        Intent register = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(register);
    }
}
