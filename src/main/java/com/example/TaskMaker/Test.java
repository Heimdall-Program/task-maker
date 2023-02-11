package com.example.TaskMaker;

public class Test {
    public static int thisKol;
    public static String thisTheme;
    public static String thisCategory;
    public static Question[] thisArr;
    public static String thisSorted;
    int kol;
    int numberOfRightQuestions;
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
        this.issorted = issorted;
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

    public int getNumberOfRightQuestions() {
        return numberOfRightQuestions;
    }

    public void setNumberOfRightQuestions(int numberOfRightQuestions) {
        this.numberOfRightQuestions = numberOfRightQuestions;
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
