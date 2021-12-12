package com.example.kyrsovayav18;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.kyrsovayav18.apadter.RecyclerViewAdapter;
import com.example.kyrsovayav18.model.Apartmens;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Apartmens> apartmensList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apartmensList = new ArrayList<>();
        apartmensList.add(new Apartmens(R.drawable.apart1,"1"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"2"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"3"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"4"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"5"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"6"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"7"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"8"));
        apartmensList.add(new Apartmens(R.drawable.apart1,"Category"));

        RecyclerView myrsv= findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, apartmensList);
        myrsv.setLayoutManager(new GridLayoutManager(this, 3));
        myrsv.setAdapter(myAdapter);

    }
}