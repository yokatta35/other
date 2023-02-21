package ru.otus.java.homework;

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
        for (int i = 0; i < 4; i++) {
            answers[i].print_answer();
        }
    }

    // getter
    public PossibleAnswer getAnswerByNumber(int questionsNumber) {
        // берем на вход номер ответа, находим по индексу "ответ" наш конкретный ответ
        // и возвращаем его
        return this.answers[questionsNumber];
    }

    public void printDecision(int numberOfAnswer) {
        PossibleAnswer possibleAnswer = this.getAnswerByNumber(numberOfAnswer);
        possibleAnswer.printIsCorrect();
    }

//    // setter
//    public void setAnswers(PossibleAnswer[] answers) {
//        this.answers = answers;
//    }

}
