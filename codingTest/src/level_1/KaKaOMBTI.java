package level_1;

import java.util.HashMap;

public class KaKaOMBTI {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        HashMap<Character, Integer> score = new HashMap<>();
        Character[] personality = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        for (int i = 0; i < personality.length; i++) {
            score.put(personality[i], 0);
        }

        for (int i = 0; i < choices.length; i++) {
            switch (choices[i]) {
                case 1:
                    score.put(survey[i].charAt(0), score.get(survey[i].charAt(0)) + 3);
                    break;
                case 2:
                    score.put(survey[i].charAt(0), score.get(survey[i].charAt(0)) + 2);
                    break;
                case 3:
                    score.put(survey[i].charAt(0), score.get(survey[i].charAt(0)) + 1);
                    break;
                case 4:
                    break;
                case 5:
                    score.put(survey[i].charAt(1), score.get(survey[i].charAt(1)) + 1);
                    break;
                case 6:
                    score.put(survey[i].charAt(1), score.get(survey[i].charAt(1)) + 2);
                    break;
                case 7:
                    score.put(survey[i].charAt(1), score.get(survey[i].charAt(1)) + 3);
                    break;
            }
        }
        System.out.println("score = " + score);

        answer += makeAnswer('R', 'T', score);
        answer += makeAnswer('C', 'F', score);
        answer += makeAnswer('J', 'M', score);
        answer += makeAnswer('A', 'N', score);

        System.out.println("answer = " + answer);

        return answer;
    }

    private char makeAnswer(char A, char B, HashMap<Character, Integer> score) {
        if(score.get(A)>score.get(B)){
            return A;
        }
        if(score.get(A)<score.get(B)){
            return B;
        }
        return A;
    }


    public static void main(String[] args) {
        KaKaOMBTI kaKaOMBTI = new KaKaOMBTI();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choice = {5, 3, 2, 7, 5};
        kaKaOMBTI.solution(survey, choice);
    }
}
