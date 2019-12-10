package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.models.Task;

import java.util.ArrayList;

public class Task_Adapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    public ArrayList<Task> objects;
    public Task_Adapter(Context context, ArrayList<Task> tasks)
    {
        this.context=context;
        objects=tasks;
        inflater=(LayoutInflater)
                this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override


    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(view==null)
        {
            view=inflater.inflate(R.layout.item_task, parent, false);
        }
        final Task t= getTask(position);
        Button bdel = view.findViewById(R.id.dltbtn);
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delTask(position);
            }
        });
        TextView tv=view.findViewById(R.id.title);
        tv.setText(t.title);
        return view;

    }


    public Task getTask (int position)
    {
        return((Task) getItem(position));
    }
    public void addTask(Task task)
    {
        objects.add(task);
        this.notifyDataSetChanged();
    }

    public void delTask(int position)
    {
        objects.remove(position);
        this.notifyDataSetChanged();

    }
}
