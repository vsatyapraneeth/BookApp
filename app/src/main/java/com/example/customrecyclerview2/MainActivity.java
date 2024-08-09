package com.example.customrecyclerview2;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.customrecyclerview2.adapter.RecyclerAdapter;
import com.example.customrecyclerview2.model.RecyclerModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RecyclerModel> recyclerModels = new ArrayList<>();
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_name);

        //create data on recyclermodel
        recyclerModels.add(new RecyclerModel("The Great Gatsby", "F. Scott Fitzgerald", "1925"));
        recyclerModels.add(new RecyclerModel("To Kill a Mockingbird", "Harper Lee", "1960"));
        recyclerModels.add(new RecyclerModel("1984", "George Orwell", "1949"));
        recyclerModels.add(new RecyclerModel("Moby Dick", "Herman Melville", "1851"));
        recyclerModels.add(new RecyclerModel("Pride and Prejudice", "Jane Austen", "1813"));
        recyclerModels.add(new RecyclerModel("The Catcher in the Rye", "J.D. Salinger", "1951"));
        recyclerModels.add(new RecyclerModel("The Lord of the Rings", "J.R.R. Tolkien", "1954"));
        recyclerModels.add(new RecyclerModel("The Hobbit", "J.R.R. Tolkien", "1937"));
        recyclerModels.add(new RecyclerModel("Brave New World", "Aldous Huxley", "1932"));
        recyclerModels.add(new RecyclerModel("The Chronicles of Narnia", "C.S. Lewis", "1950"));
        recyclerModels.add(new RecyclerModel("Jane Eyre", "Charlotte Brontë", "1847"));
        recyclerModels.add(new RecyclerModel("Wuthering Heights", "Emily Brontë", "1847"));
        recyclerModels.add(new RecyclerModel("Catch-22", "Joseph Heller", "1961"));
        recyclerModels.add(new RecyclerModel("Fahrenheit 451", "Ray Bradbury", "1953"));


        recyclerAdapter = new RecyclerAdapter(this,recyclerModels);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}