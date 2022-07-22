package FixCode2;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public static List<String> board() {
        List<String> balls = new ArrayList<>();
        balls.add(String.valueOf(new Ball("Football")));
        balls.add(String.valueOf(new Ball("Basketball")));
        balls.add(String.valueOf(new Ball("Tennis")));
        return balls;
    }

    public int count(List<String> balls) {
        return balls.size();
    }
}
