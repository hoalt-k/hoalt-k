
package com.example.tasktracker;

// Class to represent a single task
public class Task {
    // Task properties
    private String name;
    private String dueDate;
    private boolean isCompleted;
    private boolean isPriority;

    // Constructor to create a new Task object with name and due date
    public Task(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.isCompleted = false; // Tasks start as not completed
        this.isPriority = false; // Default priority status
    }

    // Constructor to create a new Task object with only name
    public Task(String name) {
        this.name = name;
        this.dueDate = "No due date"; // Default due date value
        this.isCompleted = false; // Tasks start as not completed
        this.isPriority = false; // Default priority status
    }

    // Toggle the priority status of the task
    public void togglePriority() {
        isPriority = !isPriority;
    }

    // Getter method for task name
    public String getName() {
        return name;
    }

    // Setter method for task name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for due date
    public String getDueDate() {
        return dueDate;
    }

    // Setter method for due date
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Getter method for completion status
    public boolean isCompleted() {
        return isCompleted;
    }

    // Setter method for completion status
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    //to allow task to have priority
    public boolean isPriority() {
        return isPriority;
    }
    public void setPriority(boolean priority) {
        isPriority = priority;
    }
}
