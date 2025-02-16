package database;

// data model to represent dat from answer table
public class Answer {
    private int answerId;
    private int questionId;
    private String answerText;
    private boolean isCorrect;

    public int getAnswerId() {
        return answerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public Answer(int answerId, int questionId, String answerText, boolean isCorrect) {
        this.answerId = answerId;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
        this.answerText = answerText;
        
    }
}


/*
 * select salary as SecondLargestSalaryCodeGen , name as secondRichPepole
 * from employee
 * order by salary desc
 * limit 1
 * offset 2;
 * 
 */