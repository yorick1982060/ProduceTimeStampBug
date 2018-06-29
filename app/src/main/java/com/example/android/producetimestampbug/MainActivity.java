package com.example.android.producetimestampbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addItems(View view) {
        CollectionReference testRef = FirebaseFirestore.getInstance().collection("test");

        testRef.add(new NoPrefix());
        testRef.add(new PrefixByM());
        testRef.add(new NotPrivateAndPrefixByM());

    }
}
