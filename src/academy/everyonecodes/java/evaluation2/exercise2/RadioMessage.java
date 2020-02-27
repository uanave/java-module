package academy.everyonecodes.java.evaluation2.exercise2;

import java.util.Objects;

public class RadioMessage {
    private String content;
    private int frequency;

    public RadioMessage(String content, int frequency) {
        this.content = content;
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadioMessage that = (RadioMessage) o;
        return frequency == that.frequency &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, frequency);
    }
}
