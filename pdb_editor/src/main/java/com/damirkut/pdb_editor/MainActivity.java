package com.damirkut.pdb_editor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.damirkut.pdb_android.FirstActivity;
import com.damirkut.pdb_lib.Core;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("test", Core.getStrByKey("{\"key\":22}", "key"));
        findViewById(R.id.button2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FirstActivity.class)));
    }
}