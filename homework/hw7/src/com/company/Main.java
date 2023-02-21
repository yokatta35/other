package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String correctAnswerOrNot;
        final String CORRECT = "Правильно";
        final String INCORRECT = "Неправильно";

        //через конструктор присваиваю каждому полю свои значения, т.е. создаю ответы на вопросы + загоняю все варианты в массив
        PossibleAnswer answer1 = new PossibleAnswer(1, "2020", false);
        PossibleAnswer answer2 = new PossibleAnswer(2, "2021", false);
        PossibleAnswer answer3 = new PossibleAnswer(3, "2022", false);
        PossibleAnswer answer4 = new PossibleAnswer(4, "2023", true);
        PossibleAnswer[] possibleAnswers = new PossibleAnswer[]{answer1, answer2, answer3, answer4};

        //через конструктор создаю вопрос, передаю в вопрос массив с ответами
        Question question = new Question(1, "Какой сегодня год?", possibleAnswers);


        //через конструктор присваиваю каждому полю свои значения, т.е. создаю ответы на вопросы + загоняю все варианты в массив
        PossibleAnswer answer5 = new PossibleAnswer(1, "никак, пиши на oracle", false);
        PossibleAnswer answer6 = new PossibleAnswer(2, "надо стараться", true);
        PossibleAnswer[] possibleAnswers1 = new PossibleAnswer[]{answer5, answer6};

        //через конструктор создаю вопрос, передаю в вопрос массив с ответами
        Question question1 = new Question(2, "Как разобраться в яве?", possibleAnswers1);

        Question[] questions = {question, question1};

        for (int i = 0; i < questions.length; i++) {
            questions[i].print_question();
            questions[i].printAnswers();
            int answerFromUser = askAnswerFromUser();
            questions[i].printDecision(answerFromUser);
            correctAnswerOrNot  = questions[i].Decision(answerFromUser);

            if (correctAnswerOrNot == CORRECT) {
                correctCount++;
            }
            else {
                wrongCount++;
            }

        }

        printResult (correctCount, wrongCount);


    }


        public static int askAnswerFromUser ()
        {
                final int MINUS_ONE_FOR_ARRAY = 1;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите номер ответа:");
                int answer = 0;
                answer = scanner.nextInt();
                return answer - MINUS_ONE_FOR_ARRAY;
        }

        public static void printResult (int correctCount, int wrongCount)
        {
            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }

    }





