package com.savewater.reactbackend.model;

public class TaskInput {

    private String taskName;
    private double minutes;

    public TaskInput() {}
    public TaskInput(String taskName, double minutes) {
        this.taskName = taskName;
        this.minutes = minutes;
    }
    
    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public double getMinutes() { return minutes; }
    public void setMinutes(double minutes) { this.minutes = minutes; }
}