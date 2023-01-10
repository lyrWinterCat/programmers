package level_2;

import java.util.ArrayList;

public class PredicBracket {
    public int solution(int n, int a, int b) {
        int answer = 0;
        a--;
        b--;
        for (int i = 1; i <= 20; i++) {
            double temp = Math.pow(2, i);
            System.out.println("temp = " + temp);
            if ((int) (a / temp) == (int) (b / temp)) {
                answer = i;
                break;
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        PredicBracket predicBracket = new PredicBracket();
        int n = 8;
        int a = 4;
        int b = 5;
        int solution = predicBracket.solution(n, a, b);
        System.out.println("solution = " + solution);
    }
}
