package level_0;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PolynominalCalculate {
    public String solution(String polynomial) {
        String answer = "x";
        String[] split = polynomial.split(" ");

        int addX = 0;
        int normal = 0;

        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0 && split[i].contains("x")) {
                if (split[i].length() == 1) {
                    addX++;
                } else {
                    addX += Integer.parseInt(split[i].substring(0, split[i].length() - 1));

                }
            } else if (i % 2 == 0) {
                normal += Integer.parseInt(split[i]);
            }
        }

        return makeAnswer(addX, normal, answer);
    }

    private String makeAnswer(int addX, int normal, String answer) {
        if (addX != 0 && normal == 0) {
            if (addX == 1) {
                return answer;
            }
            return addX + answer;
        }
        if (addX == 0 && normal != 0) {
            return String.valueOf(normal);
        }

        if (addX == 1) {
            return answer + " + " + normal;
        }

        return addX + answer + " + " + normal;
    }

    public static void main(String[] args) {
        PolynominalCalculate polynominalCalculate = new PolynominalCalculate();
        String polynominal = "x + 11 + 12";
        String solution = polynominalCalculate.solution(polynominal);
        System.out.println("solution = " + solution);
    }
}

