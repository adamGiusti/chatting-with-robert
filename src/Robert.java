import java.util.Scanner;
import java.util.Calendar;

public class Robert {
    Scanner scanner = new Scanner(System.in);

    void introduce() {
        System.out.println("Hello there! I'm Robert, an interactive chat bot.");
        System.out.println("I'm glad you've decided to talk with me! :)");
        System.out.println();

        System.out.println("Let me tell you a little bit more about myself.");
        System.out.println("I was created in the year 2020 and developed through the Java programming language.");
        System.out.println("I'm here to demonstrate some basic principles of Java in action.");
        System.out.println();
    }

    void askName() {
        System.out.println("But enough about me, I'd like to hear about you! What's your first name?");
        System.out.println();

        String firstName = scanner.next();
        System.out.println();

        System.out.println("And your last?");
        System.out.println();

        String lastName = scanner.next();
        String fullName = firstName + " " + lastName;
        System.out.println();

        System.out.println("Nice to meet you, " + fullName + ".");
    }

    void askBirthYear() {
        System.out.println("Now, tell me what year you were born.");
        System.out.println();

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println();

        System.out.println("Hmm, based purely on your year of birth, that must mean you're " + age + " years old.");
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
}
