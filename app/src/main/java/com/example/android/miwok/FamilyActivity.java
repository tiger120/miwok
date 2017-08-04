package com.example.android.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by 12112 on 2017/7/21.
 */

public class FamilyActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<String> familys=new ArrayList<String>();
        familys.add("father");
        familys.add("mather");
        familys.add("brother");
        familys.add("sister");
        familys.add("grandfather");

        GridView family_gridView= (GridView) findViewById(R.id.family_gridView);

        ArrayAdapter<String> family_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,familys);

        family_gridView.setAdapter(family_adapter);
    }
}
