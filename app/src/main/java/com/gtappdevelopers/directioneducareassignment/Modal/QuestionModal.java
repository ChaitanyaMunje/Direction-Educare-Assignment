package com.gtappdevelopers.directioneducareassignment.Modal;

public class QuestionModal {

    private String question;
    private String answer;
    private String votes;

    public QuestionModal(String question, String answer, String votes) {
        this.question = question;
        this.answer = answer;
        this.votes = votes;
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

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }
}
