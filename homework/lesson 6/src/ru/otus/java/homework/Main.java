package ru.otus.java.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PossibleAnswer answer1 = new PossibleAnswer(1, "2020", false);
        PossibleAnswer answer2 = new PossibleAnswer(2, "2021", false);
        PossibleAnswer answer3 = new PossibleAnswer(3, "2022", false);
        PossibleAnswer answer4 = new PossibleAnswer(4, "2023", true);
        PossibleAnswer[] possibleAnswers = new PossibleAnswer[] {answer1, answer2, answer3, answer4};
        Question question = new Question(1, "Какой сегодня год?", possibleAnswers);
        Question[] questions = new Question[4];
        for (int i = 0; i < 4; i++) {
            questions[i].print_question();
            questions[i].printAnswers();
            int answerFromUser = askAnswerFromUser();
            questions[i].printDecision(answerFromUser);
        }
//        question.print_question();
//        question.printAnswers();
//        int answerFromUser = askAnswerFromUser();
//        question.printDecision(answerFromUser);
    }

    public static int askAnswerFromUser() {
        Scanner scanner = new Scanner(System.in);
        int answer;
        while (true) {
            System.out.println("Введите номер ответа:");
            answer = scanner.nextInt();
            if (answer > 4 || answer < 1) {
                System.out.println("Выбран несуществующий вариант.");
            } else {
                return answer;
            }
        }
    }
}