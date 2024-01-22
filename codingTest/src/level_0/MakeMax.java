package level_0;

import java.util.Arrays;


public class MakeMax {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        int answer = numbers[numbers.length-1]*numbers[numbers.length-2];

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        MakeMax makeMax = new MakeMax();
        int[] numbers = {0, 31, 24, 10, 1, 9};
        makeMax.solution(numbers);
    }
}
