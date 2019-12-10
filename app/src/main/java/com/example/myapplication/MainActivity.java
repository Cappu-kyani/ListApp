package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.myapplication.adapters.Task_Adapter;
import com.example.myapplication.models.Task;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Task_Adapter adapter =new Task_Adapter(this,new ArrayList<Task>());
        final EditText t = (findViewById(R.id.editText));
        ListView l = findViewById(R.id.list);
        l.setAdapter(adapter);
        Button b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Task task = new Task(t.getText().toString(), false);
                adapter.addTask(task);
            }
        });

    }

}
