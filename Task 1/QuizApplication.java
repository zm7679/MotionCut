public class QuizApplication {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Programming questions
        String[] options1 = {
            "A Java Development Kit",
            "A Java Runtime Environment",
            "A Java Virtual Machine",
            "A JavaScript Object Notation"
        };
        Question question1 = new Question("What does JDK stand for?", options1, 0);

        String[] options2 = {
            "An integrated development environment",
            "A software testing tool",
            "A database management system",
            "A version control system"
        };
        Question question2 = new Question("What is IntelliJ IDEA?", options2, 0);

        String[] options3 = {
            "To hold multiple values in a single variable",
            "To enable inheritance",
            "To provide security",
            "To create user interfaces"
        };
        Question question3 = new Question("What is the primary purpose of an array in programming?", options3, 0);

        String[] options4 = {
            "O(n)",
            "O(log n)",
            "O(n log n)",
            "O(n^2)"
        };
        Question question4 = new Question("What is the time complexity of the binary search algorithm?", options4, 1);

        String[] options5 = {
            "A recursive function",
            "An iterative process",
            "A type of loop",
            "A conditional statement"
        };
        Question question5 = new Question("What is recursion?", options5, 0);

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.addQuestion(question4);
        quiz.addQuestion(question5);

        quiz.start();
    }
}
