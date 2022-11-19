package level_0;

import java.util.HashMap;

public class MakeGrade {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        double[] scores = new double[score.length];
        for (int i = 0; i < scores.length; i++) {
            scores[i]=(double) (score[i][0]+score[i][1])/2;
            System.out.println("i = " + scores[i]);
        }

        for (int i = 0; i < scores.length; i++) {
            int cnt = 1;
            for (int j = 0; j < scores.length; j++) {
                if(scores[j]>scores[i]) cnt++;
            }
            answer[i]=cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeGrade makeGrade = new MakeGrade();
        int[][] score = {{1,2}, {1,1}, {1,1}};
        makeGrade.solution(score);
    }
}
