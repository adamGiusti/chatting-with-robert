import java.util.Scanner;
import java.util.Calendar;

public class Robert {
    Scanner scanner = new Scanner(System.in);

    String userFirstName;
    String userLastName;
    String userFullName;

    int userAge;

    void introduce() {
        System.out.println("Hello there! I'm Robert, an interactive chat bot.");
        System.out.println("I'm glad you've decided to talk with me! :)");
        System.out.println();

        System.out.println("Let me tell you a little bit more about myself.");
        System.out.println("I was created in the year 2020 and developed through the Java programming language.");
        System.out.println("I'm here to demonstrate some basic principles of Java in action.");
        System.out.println();
    }

    void askUserName() {
        System.out.println("But enough about me, I'd like to hear about you! What's your first name?");
        System.out.println();

        userFirstName = scanner.next();
        System.out.println();

        System.out.println("And your last?");
        System.out.println();

        userLastName = scanner.next();
        userFullName = userFirstName + " " + userLastName;
        System.out.println();

        System.out.println("Nice to meet you, " + userFullName + ".");
    }

    void askUserBirthYear() {
        System.out.println("Now, tell me what year you were born.");
        System.out.println();

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int userBirthYear = scanner.nextInt();
        userAge = currentYear - userBirthYear;
        System.out.println();

        System.out.println("Hmm, based purely on your year of birth, that must mean you're " + userAge + " years old.");
        System.out.println();
    }

    void playQuiz() {
        System.out.println("Anyways, like I said before, I was programmed in Java.");
        System.out.println("It's quite an amazing language, really.");
        System.out.println("I mean, how cool is it that you can write one Java program and run it on almost any platform?!");
        System.out.println();

        System.out.println("Hey! I have a fun idea. How bout' I quiz you on your knowledge of Java?");
        System.out.println("After all, it's the reason I exist!");

        Quiz quiz = new Quiz();

        System.out.println("I have " + quiz.numberOfQuestions + " questions in mind.");
        System.out.println("You can choose A, B, C, or D for each question.");
        System.out.println("Let's start!");

        quiz.start();
    }

    void finishConversation() {
        System.out.println("Well, " + userFirstName + ", it certainly has been a pleasure talking to you.");
        System.out.println("Unfortunately, it's time for me to go.");
        System.out.println();

        System.out.println("But before I leave, do me a favor. Keep on learning Java.");
        System.out.println("By learning how to code, you can become a much better problem solver and logical thinker.");
        System.out.println("Any age is a great place to start, including " + userAge + "! ;)");
        System.out.println();

        System.out.println("Have a nice day!");
    }
}
