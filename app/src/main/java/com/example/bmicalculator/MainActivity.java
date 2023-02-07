package com.example.bmicalculator;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<contactModel> arrContactsList = new ArrayList<>();
    CardView onCard;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCard = findViewById(R.id.oneCard);

        RecyclerView recyclerView = findViewById(R.id.recycleContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContactsList.add(new contactModel(R.drawable.img1, "Clay Jhenson", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img2, "Hannah Baker", "+1 555-544-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img3, "Rayn Shaver", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Peter Parkor", "+1 809-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img5, "Peaky Blinder", "+1 123-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img9, "Clayn Helensky", "+1 555-555-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img3, "Jessica Devis", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Arthuro Rob", "+1 555-708-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img10, "Roy Denmark", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Andrino Robins", "+1 888-555-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img8, "Diesen Dawn", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img3, "Tylor Down", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img9, "Justin Folie", "+1 555-807-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img6, "Ray Tyson", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img8, "Corney Disoza", "+1 555-709-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img10, "Brywn Barbar", "+1 555-555-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Helena Stnlay", "+1 555-000-555", "Online"));

        recyclerContactAdapter adapter = new recyclerContactAdapter(this, arrContactsList);
        recyclerView.setAdapter(adapter);

        onCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });

     }

    }