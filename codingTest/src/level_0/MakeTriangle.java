package level_0;

import java.util.ArrayList;

public class MakeTriangle {
    public int solution(int[] sides) {

        int big = Math.max(sides[0],sides[1]);
        int small = Math.min(sides[0],sides[1]);

        int lowLimit = big-small;
        int hightLimit = big+small;

        int answer = hightLimit-lowLimit-1;

        return answer;
    }

    public static void main(String[] args) {
        MakeTriangle makeTriangle = new MakeTriangle();
        int[] sides = {1,2};
        makeTriangle.solution(sides);
    }
}
