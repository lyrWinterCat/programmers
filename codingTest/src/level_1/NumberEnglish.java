package level_1;

import java.util.ArrayList;
import java.util.List;

public class NumberEnglish {
    public int solution(String s) {
        ArrayList<String> numbers = new ArrayList<>(List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));

        StringBuilder answerNum = new StringBuilder();
        String number = "";

        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[0-9]")) {
                answerNum.append(s.charAt(i));
            } else {
                number += s.charAt(i);
                if (numbers.contains(number)) {
                    answerNum.append(numbers.indexOf(number));
                    number = "";
                }
            }
        }
        return Integer.parseInt(answerNum.toString());
    }

    public static void main(String[] args) {
        NumberEnglish numberEnglish = new NumberEnglish();
        String s = "one4seveneight";
        int solution = numberEnglish.solution(s);
        System.out.println("solution = " + solution);
    }
}
