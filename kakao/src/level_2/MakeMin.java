package level_2;

import java.util.Arrays;
import java.util.Comparator;

public class MakeMin {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int length = B.length;
//        Integer[] temp = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(temp,Comparator.reverseOrder());

        for (int i = 0; i < length; i++) {
            answer+=A[i]*B[ length - 1 - i];
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeMin makeMin = new MakeMin();
        int[]A = {1,2};
        int[]B = {3,4};
        int solution = makeMin.solution(A, B);
        System.out.println(solution);
    }
}
