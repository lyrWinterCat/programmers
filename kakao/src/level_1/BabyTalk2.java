package level_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BabyTalk2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canTalk = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < canTalk.length; j++) {
                babbling[i] = babbling[i].replaceAll(canTalk[j], String.valueOf(j));
            }
        }
        for (String s : babbling) {
            if (s.matches("^[0-9]*$")) {
                Pattern pattern = Pattern.compile("0{2,}|1{2,}|2{2,}|3{2,}");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.find()) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BabyTalk2 babyTalk2 = new BabyTalk2();
        String[] babbling = {"ayaayaayaye", "ye", "woo", "ma"};
        int solution = babyTalk2.solution(babbling);
        System.out.println("solution = " + solution);
    }
}
