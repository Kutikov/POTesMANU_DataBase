package com.damirkut.pdb_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.damirkut.pdb_lib.Core;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button b = findViewById(R.id.button33);
        b.setOnClickListener(v -> {
            String ans = Core.getStrByKey("{\n" +
                    "  \"query\": \"Виктор Иван\",\n" +
                    "  \"count\": 7\n" +
                    "}", "query");
            ((TextView)findViewById(R.id.textView)).setText(ans);
        });
    }
}