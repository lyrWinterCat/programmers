package level_0;

import java.util.HashMap;

public class HateEnglish {
    public long solution(String numbers) {
        String[] numbersE = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] numbersInt = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbersE.length; i++) {
            numbers=numbers.replaceAll(numbersE[i],""+numbersInt[i]);
        }
        long answer = Long.valueOf(numbers);
        return answer;
    }

    public static void main(String[] args) {
        HateEnglish hateEnglish = new HateEnglish();
        String numbers = "onefourzerosixseven";
        hateEnglish.solution(numbers);
    }
}
