package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.*;
import com.google.gson.reflect.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b22samer";
    private final String JSON_FILE = "FootballTeams.json";

    private ArrayList<RecyclerViewItem> FootballTeams = new ArrayList<>();
    private RecyclerViewAdapter adapter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("json_output", "hello from onCreate");
        Log.d("onCreateTAG", "" + FootballTeams.size());

        adapter = new RecyclerViewAdapter(this, FootballTeams, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
            }

        });

        new JsonTask(this).execute(JSON_URL);

        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(intent);
            }
        });

    }

    @Override
    public void onPostExecute(String json) {

        Log.d("json_output", "hello from onPostExecute");
        Gson gson = new Gson();

        // Unmarshall JSON -> list of objects
        Type type = new TypeToken<List<FootballTeams>>() {}.getType();
        List<FootballTeams> listOfMountains = gson.fromJson(json, type);

        for(FootballTeams Teams : listOfMountains){
            Log.d("json_output_loop", Teams.getName());
            FootballTeams.add(new RecyclerViewItem(Teams.getName()));
        }


        adapter.notifyDataSetChanged();

        Log.d("json_output", "" + json);

        RecyclerView view = findViewById(R.id.recycler_list);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);
    }




}