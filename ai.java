import java.util.Scanner;
public class AI {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter a question
        System.out.println("What would you like to know?");
        // Read the user's question
        String question = scanner.nextLine();
        // Process the user's question and return an answer
        Answer answer = processQuestion(question);
        // Print the answer to the user
        System.out.println(answer);
    }
    // This method processes the user's question and returns an answer.
    private static Answer processQuestion(String question) {
        // First, we need to understand the question.
        QuestionParser parser = new QuestionParser();
        Question parsedQuestion = parser.parse(question);
        // Now that we understand the question, we can start to formulate an answer.
        AnswerGenerator generator = new AnswerGenerator();
        Answer answer = generator.generateAnswer(parsedQuestion);
        return answer;
    }
}
