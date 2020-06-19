package model;

import java.util.Objects;

public class Answer {

    private int id;
    private String value;
    private boolean isCorrect;

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return id == answer.id &&
                isCorrect == answer.isCorrect &&
                value.equals(answer.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, isCorrect);
    }

    public Answer(int id, String value, boolean isCorrect) {
        this.id = id;
        this.value = value;
        this.isCorrect = isCorrect;
    }

    public int getID() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
