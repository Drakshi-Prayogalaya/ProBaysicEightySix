package com.grape.basic8086pro;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kbhargav on 2/26/2016.
 */
public class InstructionDescriptionActivity extends AppCompatActivity
{
    TextView textView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_description);

        textView = (TextView)findViewById(R.id.textViewDescription);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Slabo27px-Regular.ttf");
        textView.setTypeface(tf);

        intent = getIntent();
        
        intentCheck("instruction");

        intentCheck("details");

        ////AdBuddiz.cacheAds(this);
        ////AdBuddiz.showAd(this);

    }

    public void intentCheck(String code)
    {
        if(intent.hasExtra(code))
        {
            textView.setText(intent.getStringExtra(code));
        }
    }
}
