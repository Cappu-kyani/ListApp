package com.example.myapplication.models;

import androidx.annotation.NonNull;

public class Task {
    public String title;
    public boolean check;
    public Task(String title, boolean check)
    {
        this.title=title;
        this.check=check;
    }
}
