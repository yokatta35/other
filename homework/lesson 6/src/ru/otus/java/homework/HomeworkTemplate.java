package ru.otus.java.homework;

import java.util.Scanner;

public class HomeworkTemplate {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;
        final String CORRECT = "Правильно";
        final String INCORRECT = "Неправильно";
        final String ERR_ANSWER = "Такого варианта ответа не существует";

        String[] questions = {"сколько дней в неделе?", "можно ли пройти ревью с первого раза?"};

        String[][] answerOptions = {{"6", "7", "8", "9"}, {"да", "нет"}};

        int[] correctAnswers = {2, 2};


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {

            System.out.println("Вопрос:" + questions[i]);

            for (int k = 0; k < answerOptions[i].length; k++) {
                System.out.println("Вариант " + (k + 1) + ": " + answerOptions[i][k]);
            }
            ;

             String answer;
            answer = scanner.nextLine();
            int answer_int;
            try {
                answer_int = Integer.valueOf(answer);
                System.out.println("Ваш ответ: " + answerOptions[i][answer_int - 1]);
                if (answer_int == correctAnswers[i]) {
                    System.out.println(CORRECT);
                    correctCount++;
                } else {
                    wrongCount++;
                    System.out.println(INCORRECT);
                }
            } catch (Exception e) {
                wrongCount++;
                System.out.println(ERR_ANSWER);
            }


        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
