package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddFraction {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1 * denom2 + denom1 * numer2;
        int bottom = denom1 * denom2;
        int gcd = makeGCD(top, bottom);
        int[] answer = {top/gcd, bottom/gcd};
        return answer;
    }

    private int makeGCD(int top, int bottom) {
        if(top%bottom==0){
            return bottom;
        }
        return makeGCD(bottom, top%bottom);
    }

    public static void main(String[] args) {
        AddFraction addFraction = new AddFraction();
//        int[] answer = addFraction.solution(4,3,4,3);
        int[] answer = addFraction.solution(3,3,3,2);
        System.out.println(Arrays.toString(answer));
    }
}
