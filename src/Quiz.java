import java.util.Scanner;

public class Quiz {
    Scanner scanner = new Scanner(System.in);
    int numberOfQuestions = 5;
    int currentQuestion = 0;
    int score;

    void start() {
        score = 0;

        System.out.println();

        askQuestions();
        printResults();
    }

    void askQuestions() {
        currentQuestion++;
        askQuestion1();
        currentQuestion++;
        askQuestion2();
        currentQuestion++;
        askQuestion3();
        currentQuestion++;
        askQuestion4();
        currentQuestion++;
        askQuestion5();
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
        char correctAnswer = 'd';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    void askQuestion2() {
        System.out.println("2. Which of the following pieces of code represents a single-line comment?");
        System.out.println();

        System.out.println("A. /* */");
        System.out.println("B. //");
        System.out.println("C. <!-- -->");
        System.out.println("D. #");
        System.out.println();

        char userAnswer = getUserAnswer();
        char correctAnswer = 'b';

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
        char correctAnswer = 'c';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    void askQuestion4() {
        System.out.println("4. Which of the following types is NOT used for storing integers?");
        System.out.println();

        System.out.println("A. double");
        System.out.println("B. int");
        System.out.println("C. short");
        System.out.println("D. byte");
        System.out.println();

        char userAnswer = getUserAnswer();
        char correctAnswer = 'a';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    void askQuestion5() {
        System.out.println("5. Which of the following expressions properly uses the ternary operator?");
        System.out.println();

        System.out.println("A. false && false 0 : 1 ?");
        System.out.println("B. 'A' : 'Z' ? (!true || false) && true");
        System.out.println("C. true || false ? \"YES\" : \"NO\"");
        System.out.println("D. true ^ false");
        System.out.println();

        char userAnswer = getUserAnswer();
        char correctAnswer = 'c';

        validateUserAnswer(userAnswer, correctAnswer);
    }

    char getUserAnswer() {
        char userAnswer = Character.toLowerCase(scanner.next().charAt(0));
        System.out.println();

        return userAnswer;
    }

    void validateUserAnswer(char userAnswer, char correctAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }

        if (currentQuestion != numberOfQuestions) {
            System.out.println("Current score: " + getScore());
        }

        System.out.println();
    }

    String getScore() {
        return score + " / " + currentQuestion;
    }

    void printResults() {
        System.out.println("Finished!");
        System.out.println("Your final score was " + getScore() + ".");
        System.out.println();

        double finalScoreProportion = (double) score / numberOfQuestions;

        if (finalScoreProportion == 1) {
            System.out.println("Congratulations! That's a perfect score.");
        } else if (finalScoreProportion >= 0.8) {
            System.out.println("Not bad!");
        } else if (finalScoreProportion >= 0.6) {
            System.out.println("You might want to brush up on your Java skills.");
        } else {
            System.out.println("A failing score may sound bad, but you learn more from failure than success. Pick yourself up, and keep on practicing!");
        }
    }
}
