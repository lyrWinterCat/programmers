package level_1;

import java.util.ArrayList;

public class DartGame {
    public int solution(String dartResult) {

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

        String removeOption = dartResult.replaceAll("[*|#]", "");

        String dartScore = removeOption.replaceAll("[S|D|T]"," ");
        String[] dartScores = dartScore.split(" ");

        String bonus = removeOption.replaceAll("[0-9]","");
        int[] bonusScore = new int[3];
        for (int i = 0; i < bonusScore.length; i++) {
            if(bonus.charAt(i)=='S'){
                bonusScore[i]=1;
            }
            if(bonus.charAt(i)=='D'){
                bonusScore[i]=2;
            }
            if(bonus.charAt(i)=='T'){
                bonusScore[i]=3;
            }
        }


        return makeAnswer(dartScores,bonusScore,doubleIndex, minusIndex);
    }


    private int makeAnswer(String[] dartScores, int[] bonusScore, ArrayList<Integer> doubleIndex, ArrayList<Integer> minusIndex) {
        int[] score = new int[3];
        for (int i = 0; i < score.length; i++) {
            score[i]= (int) Math.pow(Double.parseDouble(dartScores[i]),bonusScore[i]);
        }
        score = makeBonusScore(score,doubleIndex,minusIndex);

        int answer = 0;
        for (int i : score) {
            answer+=i;
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
        String dartResult = "1S2D*3T";
        int solution = dartGame.solution(dartResult);
        System.out.println("solution = " + solution);

    }
}
