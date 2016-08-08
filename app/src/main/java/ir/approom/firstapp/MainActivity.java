package ir.approom.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contentTv = (TextView) findViewById(R.id.story_content_tv);
        Button nextStoryBtn = (Button) findViewById(R.id.next_story_btn);
        

    }
}
