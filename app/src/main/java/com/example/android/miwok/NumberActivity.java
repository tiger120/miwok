package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 12112 on 2017/7/21.
 */

public class NumberActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_number);

        String[] number=new String[10];
        number[0]="one";
        number[1]="two";
        number[2]="three";
        number[3]="four";
        number[4]="five";
        number[5]="six";
        number[6]="seven";
        number[7]="eight";
        number[8]="nine";
        number[9]="ten";

        Log.v("NumberActivity","index 0: "+number[0]);
        Log.v("NumberActivity","index 1: "+number[1]);
        Log.v("NumberActivity","index 2: "+number[2]);
        Log.v("NumberActivity","index 3: "+number[3]);
        Log.v("NumberActivity","index 4: "+number[4]);

        ArrayList<String> words=new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        Log.v("NumberActivity","index 0: "+words.get(0));
        Log.v("NumberActivity","index 1: "+words.get(1));
        Log.v("NumberActivity","index 2: "+words.get(2));

        LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);

        int index=0;
        while (words.size()<10){
            TextView number_textView=new TextView(this);
            number_textView.setText(words.get(index));
            rootView.addView(number_textView);
            index++;
        }

        for (int i=0;i<words.size();i++) {
            TextView number_textView=new TextView(this);
            number_textView.setText(words.get(i));
            rootView.addView(number_textView);
        }
    }
}
