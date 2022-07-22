package FixCode1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static class Ball {
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

    private static class Board {
        static List<String> balls;

        public static List<String> board() {
            balls = new ArrayList<>();
            balls.add(String.valueOf(new Ball("Football")));
            balls.add(String.valueOf(new Ball("Basketball")));
            balls.add(String.valueOf(new Ball("Tennis")));
            return balls;
        }
        public int count(List<String> balls) {
            return balls.size();
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count(Board.board()));
    }
}