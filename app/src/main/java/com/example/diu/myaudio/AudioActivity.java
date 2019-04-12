package com.example.diu.myaudio;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AudioActivity extends AppCompatActivity {

    private Button backBtn, forBtn;
    private Button playBtn;
    private SeekBar seekbar;
    private Runnable runnable;
    private Handler handler;
    int totaltime;

    MediaPlayer player;

    TextView storyname, writername;
    ImageView image;
    String nameStory, writerStory,link;
    String imageStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        backBtn = findViewById(R.id.backbtn);
        playBtn = findViewById(R.id.playbtn);
        forBtn = findViewById(R.id.forbtn);
        handler = new Handler();
        seekbar = findViewById(R.id.seekbar);
        seekbar.setMax(totaltime);


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
            player=new MediaPlayer();
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
            player.setDataSource(link);
            player.prepare();
            player.start();
            playBtn.setBackgroundResource(R.drawable.ic_pause_black_24dp);
            backBtn.setBackgroundResource(R.drawable.ic_back_black_24dp);
            forBtn.setBackgroundResource(R.drawable.ic_fast_black_24dp);
            playBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!player.isPlaying()){
                        player.start();
                        playBtn.setBackgroundResource(R.drawable.ic_pause_black_24dp);
                    }else {
                        player.pause();
                        playBtn.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
                    }
                }
            });
            forBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    player.seekTo(player.getCurrentPosition()+50000);
                }
            });
            backBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    player.seekTo(player.getCurrentPosition()-50000);
                }
            });
            totaltime = player.getDuration();
        }catch(Exception e){

        }

    }
}
