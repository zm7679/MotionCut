import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
            int userAnswer = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Your answer: ");
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    if (userAnswer > 0 && userAnswer <= options.length) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and " + options.length);
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // clear the invalid input
                }
            }
            if (userAnswer - 1 == question.getCorrectAnswerIndex()) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}
