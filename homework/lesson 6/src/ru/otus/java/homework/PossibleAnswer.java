package ru.otus.java.homework;

public class PossibleAnswer {
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
            System.out.println("Ответ верный.");
        } else {
            System.out.println("Ответ неверный");
        }
    }

}