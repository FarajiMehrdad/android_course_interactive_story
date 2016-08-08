package ir.approom.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by MehrdadFaraji on 8/8/16 AD.
 */
public class StoryActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactive_story);

        Button button = (Button) findViewById(R.id.start_story_btn);

        button.setOnClickListener(this);

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.start_story_btn:

                Intent intent = new Intent(getBaseContext() ,DetailStroyActivity.class);
                startActivity(intent);

                break;

            case R.id.next_story_btn:

                break;
        }
    }
}
