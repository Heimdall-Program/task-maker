package com.example.taskmaker;

public class Question {
    int number;
    String title;
    String description;
    int[] correctAnswers;

    public Question(int number, String title, String description, int[] correctAnswers) {
        this.number = number;
        this.title = title;
        this.description = description;
        this.correctAnswers = correctAnswers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
