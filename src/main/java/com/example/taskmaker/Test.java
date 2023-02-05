package com.example.taskmaker;

public class Test {
    int kol;
    int numberOfRightQuastions;
    Question[] arrOfQuestions;
    int idtests;
    String name;
    String type;
    String issorted;

    public Test(int idtests, String name, int kol, String type, String issorted) {
        this.idtests = idtests;
        this.name = name;
        this.kol = kol;
        this.type = type;
        this.issorted=issorted;
    }

    public String getIssorted() {
        return issorted;
    }

    public void setIssorted(String issorted) {
        this.issorted = issorted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public int getNumberOfRightQuastions() {
        return numberOfRightQuastions;
    }

    public void setNumberOfRightQuastions(int numberOfRightQuastions) {
        this.numberOfRightQuastions = numberOfRightQuastions;
    }

    public Question[] getArrOfQuestions() {
        return arrOfQuestions;
    }

    public void setArrOfQuestions(Question[] arrOfQuestions) {
        this.arrOfQuestions = arrOfQuestions;
    }

    public int getIdtests() {
        return idtests;
    }

    public void setIdtests(int idtests) {
        this.idtests = idtests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
