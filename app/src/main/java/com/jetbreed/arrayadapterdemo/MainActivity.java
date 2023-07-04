package com.jetbreed.arrayadapterdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String courseList[] = {
            "Java",
            "Kotlin",
            "Python",
            "JavaScript",
            "Ruby",
            "C++",
            "Swift",
            "Dart"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.simpleListView);

//        Adaptation of the Array to be placed inside the ListView
        ArrayAdapter < String > arrayAdapter = new ArrayAdapter < String >
                (this, R.layout.list_item, R.id.textView, courseList);

        simpleList.setAdapter(arrayAdapter);
    }
}