package model;

import java.util.List;
import java.util.Objects;

public class Question {

    private int id;
    private String value;
    private List<Answer> answers;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", answers=" + answers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id &&
                value.equals(question.value) &&
                answers.equals(question.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, answers);
    }

    public Question(int id, String value, List<Answer> answers) {
        this.id = id;
        this.value = value;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
