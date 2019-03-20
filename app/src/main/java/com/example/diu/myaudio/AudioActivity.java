package com.example.diu.myaudio;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AudioActivity extends AppCompatActivity {

    TextView storyname, writername;
    ImageView image;
    String nameStory, writerStory,link;
    String imageStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        storyname = findViewById(R.id.audioStoryName);
        writername = findViewById(R.id.audioWriterName);
        image = findViewById(R.id.audioImage);

        nameStory = getIntent().getStringExtra("storyName");
        writerStory = getIntent().getStringExtra("writterName");
        imageStory = getIntent().getStringExtra("storyImage");
        link = getIntent().getStringExtra("storyLink");
        System.out.print(link);
        storyname.setText(nameStory);
        writername.setText(writerStory);
        Picasso.get().load(imageStory).fit().into(image);
        try{
            MediaPlayer player=new MediaPlayer();
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
            player.setDataSource(link);
            player.prepare();
            player.start();
        }catch(Exception e){

        }

    }
}
