package com.example.diu.myaudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AudioActivity extends AppCompatActivity {

    TextView name;
    ImageView image;
    String nameStory;
    String imageStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        name = findViewById(R.id.audioName);
        image = findViewById(R.id.audioImage);

        nameStory = getIntent().getStringExtra("storyName");
        imageStory = getIntent().getStringExtra("storyImage");

        name.setText(nameStory);
        int resourceId = getResources().getIdentifier(imageStory,"drawable", getPackageName());
        image.setImageResource(resourceId);
    }
}
