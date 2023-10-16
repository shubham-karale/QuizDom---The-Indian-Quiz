package com.example.quizdom_theultimateindianquiz;

public class ModelClass {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctOption;

    public ModelClass(String question, String option1, String option2, String option3, String option4, String correctOption) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
    }

    public ModelClass() {
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }
}
