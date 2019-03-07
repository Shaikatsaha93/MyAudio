package com.example.diu.myaudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AudioActivity extends AppCompatActivity {

    TextView storyname, writername;
    ImageView image;
    String nameStory, writerStory;
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

        storyname.setText(nameStory);
        writername.setText(writerStory);
        Picasso.get().load(imageStory).fit().into(image);
    }
}
