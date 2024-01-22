package level_0;

import java.util.ArrayList;

public class DistinguishFiniteDecimal {

    static final int TWO = 2;
    static final int FIVE = 5;
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int solution(int a, int b) {
//        int answer = 1;

        int gcdNum = gcd(a, b);

        b /= gcdNum;

        while(b % TWO == 0){
            b/= TWO;
        }
        while(b % FIVE == 0){
            b/= FIVE;
        }

        return b == 1 ? 1 : 2;

//        ArrayList<Integer> arrayA = new ArrayList<>();
//        arrayA.add(a);
//        for (int i = a/2; i>=1; i--) {
//            if(a%i==0){
//                arrayA.add(i);
//            }
//        }
//
//        for (int i = 0; i < arrayA.size(); i++) {
//            if(b%arrayA.get(i)==0){
//                b/=arrayA.get(i);
//                break;
//            }
//        }
//        ArrayList<Integer> arrayB = new ArrayList<>();
//
//        int i = 2;
//        while (true) {
//            if (b == 1) {
//                break;
//            }
//            if (b % i == 0) {
//                b /= i;
//                arrayB.add(i);
//            } else {
//                i++;
//            }
//        }
//
//        for (int j = 0; j < arrayB.size(); j++) {
//            if (!(arrayB.get(j) == 2 || arrayB.get(j) == 5)) {
//                return 2;
//            }
//        }
//
//        return answer;
    }

    public static void main(String[] args) {
        DistinguishFiniteDecimal distinguishFiniteDecimal = new DistinguishFiniteDecimal();
        int a = 12;
        int b = 21;
        int solution = distinguishFiniteDecimal.solution(a, b);
        System.out.println("solution = " + solution);
    }
}
