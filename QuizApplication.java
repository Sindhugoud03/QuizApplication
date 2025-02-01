import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. Who wrote 'Romeo and Juliet'?",
            "4. What is the square root of 64?",
            "5. What is the largest ocean on Earth?"
        };

        String[] options = {
            "a) London  b) Paris  c) Rome  d) Madrid",
            "a) Earth  b) Venus  c) Mars  d) Jupiter",
            "a) Charles Dickens  b) William Shakespeare  c) Mark Twain  d) J.K. Rowling",
            "a) 6  b) 8  c) 7  d) 9",
            "a) Atlantic  b) Indian  c) Arctic  d) Pacific"
        };

        char[] answers = {'b', 'c', 'b', 'b', 'd'}; 
        int score = 0;

        
        System.out.println("Welcome to the Quiz! Choose the correct option (a/b/c/d):\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);

            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[i] + "\n");
            }
        }

       
        int totalQuestions = questions.length;
        float percentage = ((float) score / totalQuestions) * 100;

        System.out.println("Quiz Completed!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);
        System.out.printf("Your percentage: %.2f%%\n", percentage);

        scanner.close();
    }
}
