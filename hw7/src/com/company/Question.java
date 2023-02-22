package com.company;

import java.util.Scanner;

class Question {
    private int questionsNumber;
    private String question;
    private PossibleAnswer[] answers;

    public Question(int questionsNumber, String question, PossibleAnswer[] answers) {
        this.questionsNumber = questionsNumber;
        this.question = question;
        this.answers = answers;
    }

    public void print_question() {
        System.out.println("Вопрос: " + question);
    }

    public void printAnswers() {
        for (int i = 0; i < answers.length; i++) {
            answers[i].print_answer();
        }
    }

    public PossibleAnswer getAnswerByNumber(int questionsNumber) {
        return this.answers[questionsNumber];
    }

    public void printDecision(int numberOfAnswer) {
        PossibleAnswer possibleAnswer = this.getAnswerByNumber(numberOfAnswer);
        possibleAnswer.printIsCorrect();
    }

    public String Decision(int numberOfAnswer) {
        String decision;
        PossibleAnswer possibleAnswer = this.getAnswerByNumber(numberOfAnswer);
        decision = possibleAnswer.IsCorrect();
        return decision;
    }
}
