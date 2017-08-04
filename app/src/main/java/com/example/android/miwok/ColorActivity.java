package com.example.android.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 12112 on 2017/7/21.
 */

public class ColorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_color);

//        ArrayList<String> colors=new ArrayList<String>();
//        colors.add("red");
//        colors.add("blue");
//        colors.add("green");
//        colors.add("white");
//        colors.add("yellow");
        ArrayList<Word> colors=new ArrayList<Word>();//使用自定义的Word类
        colors.add(new Word("red","rrr"));
        colors.add(new Word("blue","bbb"));
        colors.add(new Word("green","ggg"));
        colors.add(new Word("white","www"));
        colors.add(new Word("yellow","yyy"));

        ListView color_listView= (ListView) findViewById(R.id.colors_listView);

//        ArrayAdapter<String> color_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colors);
//
//        color_listView.setAdapter(color_adapter);

        WordAdapter wordAdapter=new WordAdapter(this,colors);//使用自定义的wordAdapter类
        color_listView.setAdapter(wordAdapter);
    }
}
