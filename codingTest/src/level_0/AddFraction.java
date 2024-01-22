package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class AddFraction {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1 * denom2 + denom1*numer2;
        int bottom = denom1 * denom2;
        int gcd = makeGCD(top, bottom);
        int[] answer = {top/gcd, bottom/gcd};
        return answer;
    }

    private int makeGCD(int top, int bottom) {
        ArrayList<Integer> gcd = new ArrayList<Integer>();
        ArrayList<Integer> topCommonDiviser = new ArrayList<Integer>();
        ArrayList<Integer> bottomCommonDiviser = new ArrayList<Integer>();

        for (int i = 1; i <= top; i++) {
            if(top%i==0){
                topCommonDiviser.add(i);
            }
        }
        for (int i = 1; i <= bottom; i++) {
            if(bottom%i==0){
                bottomCommonDiviser.add(i);
            }
        }

        for (int i = 0; i < topCommonDiviser.size(); i++) {
            for (int j = 0; j < bottomCommonDiviser.size(); j++) {
                if(topCommonDiviser.get(i)==bottomCommonDiviser.get(j)){
                    gcd.add(topCommonDiviser.get(i));
                }
            }
        }
        return gcd.get(gcd.size()-1);
    }

    public static void main(String[] args) {
        AddFraction addFraction = new AddFraction();
        int[] answer = addFraction.solution(1,2,3,4);
        System.out.println(Arrays.toString(answer));
    }
}
