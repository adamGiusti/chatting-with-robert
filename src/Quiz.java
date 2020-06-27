import java.util.Scanner;

public class Quiz {
    Scanner scanner = new Scanner(System.in);
    int numberOfQuestions = 5;
    int score;

    void start() {
        score = 0;

        System.out.println();

        askQuestions();
    }

    void askQuestions() {
        askQuestion1();
        askQuestion2();
        askQuestion3();
    }

    void askQuestion1() {
        System.out.println("1. Which of the following variable names is an illegal identifier?");
        System.out.println();

        System.out.println("A. _variableOne");
        System.out.println("B. $variableTwo");
        System.out.println("C. variable3");
        System.out.println("D. 4thVariable");
        System.out.println();

        char userAnswer = getUserAnswer();
        char correctAnswer = 'D';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    void askQuestion2() {
        System.out.println("2. Which of the following represents a single-line comment?");
        System.out.println();

        System.out.println("A. /* */");
        System.out.println("B. //");
        System.out.println("C. <!-- -->");
        System.out.println("D. #");
        System.out.println();

        char userAnswer = getUserAnswer();
        char correctAnswer = 'B';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    void askQuestion3() {
        System.out.println("3. Which of the following is a post-test loop?");
        System.out.println();

        System.out.println("A. while loop");
        System.out.println("B. for loop");
        System.out.println("C. do-while loop");
        System.out.println("D. for-each loop");
        System.out.println();

        char userAnswer = getUserAnswer();
        char correctAnswer = 'C';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    char getUserAnswer() {
        char userAnswer = scanner.next().charAt(0);
        System.out.println();

        return userAnswer;
    }

    void validateUserAnswer(char userAnswer, char correctAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            System.out.println();
            score++;
        } else {
            System.out.println("Incorrect.");
            System.out.println();
        }
    }
}
