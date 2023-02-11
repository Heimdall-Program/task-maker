package com.example.TaskMaker;

public class Question {
    int number;
    String title;

    String[] answers;
    int[] correctAnswers;

    public Question(int number, String title, String[] answers, int[] correctAnswers) {
        this.number = number;
        this.title = title;
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
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


    public int[] getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
