package com.example.android.bageri;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    TextView List1;
    int count = 0;
    ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resources res = getResources();
        //initialize string, get array
        String[] address_list = getResources().getStringArray(R.array.list);
        ListView List1 = (ListView) findViewById(R.id.list1);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, address_list);
        List1.setAdapter(listAdapter);


    }

}
