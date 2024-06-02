package question;

public class Question {
    private String question ;
    private String answer ;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public Question() {
        question = "";
        answer = "";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public boolean chackAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println(question);
    }
}
