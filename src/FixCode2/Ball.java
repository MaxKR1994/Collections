package FixCode2;

public class Ball {
    public String type;

    public Ball(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                '}';
    }
}
