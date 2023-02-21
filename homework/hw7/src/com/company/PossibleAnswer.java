package com.company;

public class PossibleAnswer {
    final String CORRECT = "Правильно";
    final String INCORRECT = "Неправильно";

    private int numberOfAnswer;
    private String answer;
    private boolean correctOrNot;

    public PossibleAnswer(int numberOfAnswer, String answer, boolean correctOrNot) {
        this.numberOfAnswer = numberOfAnswer;
        this.answer = answer;
        this.correctOrNot = correctOrNot;
    }

    public void print_answer() {
        System.out.println("Вариант #" + numberOfAnswer + ". " + answer);
    }

    public void printIsCorrect() {
        if (correctOrNot == true) {
            System.out.println(CORRECT);
        } else {
            System.out.println(INCORRECT);
        }
    }

    public String IsCorrect() {
        if (correctOrNot == true) {
            return CORRECT;
        } else {
            return INCORRECT;
        }
    }

}