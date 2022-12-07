package level_1;


import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer [] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score2, Collections.reverseOrder());

        int[][] fruitsBox = new int[score.length/m][m];
        for (int i = 0; i < fruitsBox.length; i++) {
            for (int j = i*m; j < i*m+m; j++) {
                fruitsBox[i][j-(i*m)]=score2[j];
            }
        }

        for (int[] box : fruitsBox) {
            int min = box[m-1];
            answer+=min*box.length;
        }
        return answer;
    }

    public static void main(String[] args) {
        FruitSeller fruitSeller = new FruitSeller();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int solution = fruitSeller.solution(k, m, score);
        System.out.println("solution = " + solution);
    }
}
