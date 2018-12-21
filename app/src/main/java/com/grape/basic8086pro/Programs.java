package com.grape.basic8086pro;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by rarodi on 12/15/2015.
 */
public class Programs extends AppCompatActivity
{
    Button b1;
    TextView tv,tva;
    RelativeLayout rela1;

    @ColorInt
    static final int darkGreen = 0xFF1B5E20;

    String program;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programs);

        final Activity activity = this;
        ////AdBuddiz.setLogLevel(////AdBuddizLogLevel.Info);    // log level
        ////AdBuddiz.setPublisherKey("18222168-d0a0-4c7a-ac72-3d41864a13b8"); // replace with your app publisher key
        ////AdBuddiz.cacheAds(activity);
        ////AdBuddiz.showAd(this);

        //TextView tv,tva;

        tv = (TextView)findViewById(R.id.textView3);
        tva = (TextView)findViewById(R.id.textView1);

        rela1 = (RelativeLayout)findViewById(R.id.relalay1);
        rela1.setVisibility(View.GONE);
        tva.setVisibility(View.GONE);

        String fontpath = "fonts/Slabo27px-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tv.setTypeface(tf);
        tva.setTypeface(tf);

        b1 = (Button)findViewById(R.id.button1);
        final Intent i = getIntent();

        if(i.hasExtra("c1"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c1");
            tv.setText(program);
            tva.setText("PROGRAM 1");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c2"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c2");
            tv.setText(program);
            tva.setText("PROGRAM 2");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c3"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c3");
            tv.setText(program);
            tva.setText("PROGRAM 3");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c4"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c4");
            tv.setText(program);
            tva.setText("PROGRAM 4");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c5"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c5");
            tv.setText(program);
            tva.setText("PROGRAM 5");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c6"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c6");
            tv.setText(program);
            tva.setText("PROGRAM 6");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c7"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c7");
            tv.setText(program);
            tva.setText("PROGRAM 7");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c8"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c8");
            tv.setText(program);
            tva.setText("PROGRAM 8");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c9"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c9");
            tv.setText(program);
            tva.setText("PROGRAM 9");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c10"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c10");
            tv.setText(program);
            tva.setText("PROGRAM 10");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c11"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c11");
            tv.setText(program);
            tva.setText("PROGRAM 11");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c12"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c12");
            tv.setText(program);
            tva.setText("PROGRAM 12");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c13"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c13");
            tv.setText(program);
            tva.setText("PROGRAM 13");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c14"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c14");
            tv.setText(program);
            tva.setText("PROGRAM 14");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c15"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c15");
            tv.setText(program);
            tva.setText("PROGRAM 15");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c16"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c16");
            tv.setText(program);
            tva.setText("PROGRAM 16");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c17"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c17");
            tv.setText(program);
            tva.setText("PROGRAM 17");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c18"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c18");
            tv.setText(program);
            tva.setText("PROGRAM 18");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c19"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c19");
            tv.setText(program);
            tva.setText("PROGRAM 19");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c20"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c20");
            tv.setText(program);
            tva.setText("PROGRAM 20");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c21"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c21");
            tv.setText(program);
            tva.setText("PROGRAM 21");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c22"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c22");
            tv.setText(program);
            tva.setText("PROGRAM 22");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c23"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c23");
            tv.setText(program);
            tva.setText("PROGRAM 23");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c24"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c24");
            tv.setText(program);
            tva.setText("PROGRAM 24");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c25"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c25");
            tv.setText(program);
            tva.setText("PROGRAM 25");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c26"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c26");
            tv.setText(program);
            tva.setText("PROGRAM 26");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c27"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c27");
            tv.setText(program);
            tva.setText("PROGRAM 27");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c28"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c28");
            tv.setText(program);
            tva.setText("PROGRAM 28");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c29"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c29");
            tv.setText(program);
            tva.setText("PROGRAM 29");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c30"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c30");
            tv.setText(program);
            tva.setText("PROGRAM 30");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c31"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c31");
            tv.setText(program);
            tva.setText("PROGRAM 31");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c32"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c32");
            tv.setText(program);
            tva.setText("PROGRAM 32");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c33"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c33");
            tv.setText(program);
            tva.setText("PROGRAM 33");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c34"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c34");
            tv.setText(program);
            tva.setText("PROGRAM 34");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c35"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c35");
            tv.setText(program);
            tva.setText("PROGRAM 35");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c36"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c36");
            tv.setText(program);
            tva.setText("PROGRAM 36");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c37"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c37");
            tv.setText(program);
            tva.setText("PROGRAM 37");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c38"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c38");
            tv.setText(program);
            tva.setText("PROGRAM 38");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c39"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c39");
            tv.setText(program);
            tva.setText("PROGRAM 39");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c40"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c40");
            tv.setText(program);
            tva.setText("PROGRAM 40");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c41"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c41");
            tv.setText(program);
            tva.setText("PROGRAM 41");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c42"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c42");
            tv.setText(program);
            tva.setText("PROGRAM 42");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c43"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c43");
            tv.setText(program);
            tva.setText("PROGRAM 43");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c44"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c44");
            tv.setText(program);
            tva.setText("PROGRAM 44");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c45"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c45");
            tv.setText(program);
            tva.setText("PROGRAM 45");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c46"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c46");
            tv.setText(program);
            tva.setText("PROGRAM 46");
            ////AdBuddiz.cacheAds(this);
        }

        if(i.hasExtra("c47"))
        {
            tv = (TextView)findViewById(R.id.textView3);
            tva = (TextView)findViewById(R.id.textView1);
            program = i.getStringExtra("c47");
            tv.setText(program);
            tva.setText("PROGRAM 47");
            ////AdBuddiz.cacheAds(this);
        }


        ////AdBuddiz.showAd(this);

        String array[] = this.getResources().getStringArray(R.array.instructions_array);

        SpannableString ss = new SpannableString(program);

        for (int a = array.length - 1; a >= 0; a--)
        {
            int temp = a;
            //ss.setSpan(new URLSpan(temp))
            if (search(array[a]+ " ", program) >= 0){
                ss.setSpan(new CustomSpan(temp), search(array[a], program), search(array[a], program) + array[a].length(), 0);
            }
            tv.setText(ss);
            tv.setMovementMethod(LinkMovementMethod.getInstance());
        }

        // newly added code to highlight the comments
        int semiCounter = 0;
        int slashCounter = 0;
        int temp;

        for(int z=0; z<program.length(); z++)
        {
            if(program.charAt(z) == ';')
            {
                semiCounter = semiCounter + 1;
                Log.e("Semicolon", String.valueOf(semiCounter));
                temp = program.indexOf("\n", z);
                slashCounter = slashCounter + 1;
                Log.e("Slash", String.valueOf(temp));
                //0x1B5E20
                ss.setSpan(new ForegroundColorSpan(Color.rgb(27, 94, 32)), z, temp, Spanned.SPAN_INTERMEDIATE);
            }
        }

        tv.setText(ss);
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public int search(String pat, String txt)
    {
        return txt.indexOf(pat, 0);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        ////AdBuddiz.showAd(this);
    }

    public class CustomSpan extends ClickableSpan
    {
        int i;
        public CustomSpan(int i) {
            super();
            this.i = i;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget)
        {
            int id = widget.getId();
            Intent intent = new Intent(Programs.this, InstructionDescriptionActivity.class);
            Log.e("You Clicked", String.valueOf(i));
            putIntent(intent, i);
            ////AdBuddiz.showAd(Programs.this);
            startActivity(intent);

            Log.e("ID of the spannable", String.valueOf(id));
        }

        public void putIntent(Intent intent, int value)
        {
            switch(value)
            {
                case 0:
                    intent.putExtra("details", getResources().getString(R.string.aaa));
                    break;
                case 1:
                    intent.putExtra("details", getResources().getString(R.string.aad));
                    break;
                case 2:
                    intent.putExtra("details", getResources().getString(R.string.aam));
                    break;
                case 3:
                    intent.putExtra("details", getResources().getString(R.string.aas));
                    break;
                case 4:
                    intent.putExtra("details", getResources().getString(R.string.adc));
                    break;
                case 5:
                    intent.putExtra("details", getResources().getString(R.string.adc));
                    break;
                case 6:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 7:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 8:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 9:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 10:
                    intent.putExtra("details", getResources().getString(R.string.call));
                    break;
                case 11:
                    intent.putExtra("details", getResources().getString(R.string.cbw));
                    break;
                case 12:
                    intent.putExtra("details", getResources().getString(R.string.cbw));
                    break;
                case 13:
                    intent.putExtra("details", getResources().getString(R.string.clc));
                    break;
                case 14:
                    intent.putExtra("details", getResources().getString(R.string.clc));
                    break;
                case 15:
                    intent.putExtra("details", getResources().getString(R.string.cld));
                    break;
                case 16:
                    intent.putExtra("details", getResources().getString(R.string.cld));
                    break;
                case 17:
                    intent.putExtra("details", getResources().getString(R.string.cli));
                    break;
                case 18:
                    intent.putExtra("details", getResources().getString(R.string.cli));
                    break;
                case 19:
                    intent.putExtra("details", getResources().getString(R.string.cmc));
                    break;
                case 20:
                    intent.putExtra("details", getResources().getString(R.string.cmp));
                    break;
                case 21:
                    intent.putExtra("details", getResources().getString(R.string.cmps));
                    break;
                case 22:
                    intent.putExtra("details", getResources().getString(R.string.cmps));
                    break;
                case 23:
                    intent.putExtra("details", getResources().getString(R.string.cmps));
                    break;
                case 24:
                    intent.putExtra("details", getResources().getString(R.string.daa));
                    break;
                case 25:
                    intent.putExtra("details", getResources().getString(R.string.das));
                    break;
                case 26:
                    intent.putExtra("details", getResources().getString(R.string.div));
                    break;
                case 27:
                    intent.putExtra("details", getResources().getString(R.string.div));
                    break;
                case 28:
                    intent.putExtra("details", getResources().getString(R.string.esc));
                    break;
                case 29:
                    intent.putExtra("details", getResources().getString(R.string.hlt));
                    break;
                case 30:
                    intent.putExtra("details", getResources().getString(R.string.in));
                    break;
                case 31:
                    intent.putExtra("details", getResources().getString(R.string.in));
                    break;
                case 32:
                    intent.putExtra("details", getResources().getString(R.string.inc));
                    break;
                case 33:
                    intent.putExtra("details", getResources().getString(R.string.inc));
                    break;
                case 34:
                    intent.putExtra("details", getResources().getString(R.string.interrupt));
                    break;
                case 35:
                    intent.putExtra("details", getResources().getString(R.string.interrupt));
                    break;
                case 36:
                    intent.putExtra("details", getResources().getString(R.string.iret));
                    break;
                case 37:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 38:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 39:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 40:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 41:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 42:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 43:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 44:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 45:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 46:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 47:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 48:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 49:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 50:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 51:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 52:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 53:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 54:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 55:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 56:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 57:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 58:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 59:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 60:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 61:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 62:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 63:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 64:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 65:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 66:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 67:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 68:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 69:
                    intent.putExtra("details", getResources().getString(R.string.lahf));
                    break;
                case 70:
                    intent.putExtra("details", getResources().getString(R.string.lahf));
                    break;
                case 71:
                    intent.putExtra("details", getResources().getString(R.string.lds));
                    break;
                case 72:
                    intent.putExtra("details", getResources().getString(R.string.lds));
                    break;
                case 73:
                    intent.putExtra("details", getResources().getString(R.string.lea));
                    break;
                case 74:
                    intent.putExtra("details", getResources().getString(R.string.lock));
                    break;
                case 75:
                    intent.putExtra("details", getResources().getString(R.string.lods));
                    break;
                case 76:
                    intent.putExtra("details", getResources().getString(R.string.lods));
                    break;
                case 77:
                    intent.putExtra("details", getResources().getString(R.string.lods));
                    break;
                case 78:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 79:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 80:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 81:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 82:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 83:
                    intent.putExtra("details", getResources().getString(R.string.mov));
                    break;
                case 84:
                    intent.putExtra("details", getResources().getString(R.string.movs));
                    break;
                case 85:
                    intent.putExtra("details", getResources().getString(R.string.movs));
                    break;
                case 86:
                    intent.putExtra("details", getResources().getString(R.string.movs));
                    break;
                case 87:
                    intent.putExtra("details", getResources().getString(R.string.mul));
                    break;
                case 88:
                    intent.putExtra("details", getResources().getString(R.string.mul));
                    break;
                case 89:
                    intent.putExtra("details", getResources().getString(R.string.neg));
                    break;
                case 90:
                    intent.putExtra("details", getResources().getString(R.string.nop));
                    break;
                case 91:
                    intent.putExtra("details", getResources().getString(R.string.pop));
                    break;
                case 92:
                    intent.putExtra("details", getResources().getString(R.string.pop));
                    break;
                case 93:
                    intent.putExtra("details", getResources().getString(R.string.push));
                    break;
                case 94:
                    intent.putExtra("details", getResources().getString(R.string.push));
                    break;
                case 95:
                    intent.putExtra("details", getResources().getString(R.string.rcl));
                    break;
                case 96:
                    intent.putExtra("details", getResources().getString(R.string.rcl));
                    break;
                case 97:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 98:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 99:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 100:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 101:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 102:
                    intent.putExtra("details", getResources().getString(R.string.ret));
                    break;
                case 103:
                    intent.putExtra("details", getResources().getString(R.string.ret));
                    break;
                case 104:
                    intent.putExtra("details", getResources().getString(R.string.rol));
                    break;
                case 105:
                    intent.putExtra("details", getResources().getString(R.string.rol));
                    break;
                case 106:
                    intent.putExtra("details", getResources().getString(R.string.sal));
                    break;
                case 107:
                    intent.putExtra("details", getResources().getString(R.string.sal));
                    break;
                case 108:
                    intent.putExtra("details", getResources().getString(R.string.sar));
                    break;
                case 109:
                    intent.putExtra("details", getResources().getString(R.string.sar));
                    break;
                case 110:
                    intent.putExtra("details", getResources().getString(R.string.scas));
                    break;
                case 111:
                    intent.putExtra("details", getResources().getString(R.string.scas));
                    break;
                case 112:
                    intent.putExtra("details", getResources().getString(R.string.scas));
                    break;
                case 113:
                    intent.putExtra("details", getResources().getString(R.string.stos));
                    break;
                case 114:
                    intent.putExtra("details", getResources().getString(R.string.stos));
                    break;
                case 115:
                    intent.putExtra("details", getResources().getString(R.string.stos));
                    break;
                case 116:
                    intent.putExtra("details", getResources().getString(R.string.sub));
                    break;
                case 117:
                    intent.putExtra("details", getResources().getString(R.string.sub));
                    break;
                case 118:
                    intent.putExtra("details", getResources().getString(R.string.test));
                    break;
                case 119:
                    intent.putExtra("details", getResources().getString(R.string.test));
                    break;
                case 120:
                    intent.putExtra("details", getResources().getString(R.string.xchg));
                    break;
                case 121:
                    intent.putExtra("details", getResources().getString(R.string.xlat));
                    break;
                case 122:
                    intent.putExtra("details", getResources().getString(R.string.xlat));
                    break;

                default:
                    break;
            }
        }
    }
}
