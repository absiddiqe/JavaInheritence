package question;
import java.util.Scanner;
public class Question1 extends Question {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Question question1 = new Question();
        question1.setQuestion("Who is the inventor of computer");
        question1.setAnswer("no one");
        question1.display();
        String response = in.nextLine();
        System.out.println(question1.chackAnswer(response.toLowerCase()));
    }
}
