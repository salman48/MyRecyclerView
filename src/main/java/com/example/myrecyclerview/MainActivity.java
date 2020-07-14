package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] ={R.drawable.a_space_odyssey,R.drawable.avengers,R.drawable.gravity,R.drawable.inception,R.drawable.john_wick,R.drawable.revenant,R.drawable.the_martian,R.drawable.antman,R.drawable.thor,R.drawable.conjuring,R.drawable.titanic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.movies_name);
        s2 = getResources().getStringArray(R.array.description);
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
