package level_1;

import java.util.ArrayList;

public class DartGame {
    public int solution(String dartResult) {

        ArrayList<String> dartScore = new ArrayList<>();
        ArrayList<Integer> doubleIndex = new ArrayList<>();
        ArrayList<Integer> minusIndex = new ArrayList<>();

        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) == '*') {
                doubleIndex.add(i);
            }
            if (dartResult.charAt(i) == '#') {
                minusIndex.add(i);
            }
        }

        dartResult = dartResult.replaceAll("[*|#]", "");
        System.out.println("dartResult = " + dartResult);

        for (int i = 0; i < dartResult.length() - 1; i++) {
            if ('0' <= dartResult.charAt(i) && '9' >= dartResult.charAt(i)) {
                if (dartResult.charAt(i + 1) == 'S' || dartResult.charAt(i + 1) == 'D' || dartResult.charAt(i + 1) == 'T') {
                    dartScore.add(dartResult.substring(i, i + 2));
                }
                if('0' <= dartResult.charAt(i+1) && '9' >= dartResult.charAt(i+1)){
                    dartScore.add(dartResult.substring(i, i + 3));
                }
            }
        }

        return makeAnswer(dartScore, doubleIndex, minusIndex);
    }


    private int makeAnswer(ArrayList<String> dartScore, ArrayList<Integer> doubleIndex, ArrayList<Integer> minusIndex) {
        int[] score = new int[4];
        int answer = 0;
        for (int i = 0; i < dartScore.size(); i++) {
            switch (dartScore.get(i).charAt(dartScore.get(i).length()-1)) {
                case 'S':
                    score[i] = Integer.parseInt(dartScore.get(i).replaceAll("S", ""));
                    break;
                case 'D':
                    score[i] = (int) Math.pow(Double.parseDouble(dartScore.get(i).replaceAll("D", "")),2);
                    break;
                case 'T':
                    score[i] = (int) Math.pow(Double.parseDouble(dartScore.get(i).replaceAll("T", "")),3);
                    break;
            }
        }
        if (!(doubleIndex.isEmpty() && minusIndex.isEmpty())) {
            score = makeBonusScore(score, doubleIndex, minusIndex);
        }

        for (int i : score) {
            System.out.println("i = " + i);
            answer += i;
        }
        return answer;
    }

    private int[] makeBonusScore(int[] score, ArrayList<Integer> doubleIndex, ArrayList<Integer> minusIndex) {
        for (int i = 0; i < doubleIndex.size(); i++) {
            if (doubleIndex.get(i) == 2) {
                score[0] *= 2;
            } else if (doubleIndex.get(i) < 6) {
                score[0] *= 2;
                score[1] *= 2;
            } else if(doubleIndex.get(i) >= 6){
                score[1] *= 2;
                score[2] *= 2;
            }
        }
        for (int i = 0; i < minusIndex.size(); i++) {
            if (minusIndex.get(i) == 2) {
                score[0] *= -1;
            } else if (minusIndex.get(i) < 6) {
                score[1] *= -1;
            } else if(minusIndex.get(i) >= 6){
                score[2] *= -1;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        DartGame dartGame = new DartGame();
        String dartResult = "1D2S#10S";
        int solution = dartGame.solution(dartResult);
        System.out.println("solution = " + solution);

    }
}
