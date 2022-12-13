package level_0;

import java.util.ArrayList;
import java.util.Collections;

public class SameLine {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] answerLine = new int[202];
        for (int i = 0; i < lines.length; i++) {
            for (int j = i+1; j < lines.length; j++) {
                makeLine(lines[i], lines[j], answerLine);
            }
        }

        for (int i : answerLine) {
            if(i>=1){
                answer++;
            }
        }

        if(answer==0){
            System.out.println("answer = " + answer);
            return 0;
        }

        System.out.println("answer = " + answer);

        return answer;
    }

    private void makeLine(int[] first, int[] second, int[] answerLine) {
        int start = Math.max(first[0]+100,second[0]+100);
        int end = Math.min(first[1]+100,second[1]+100);
        System.out.println(start + " "+ end);
        if(start<end){
            for (int i = start; i <end; i++) {
                answerLine[i]++;
            }
        }
    }

    public static void main(String[] args) {
        SameLine sameLine = new SameLine();
        int[][] lines = {{0,1},{2,5},{3,9}};
        sameLine.solution(lines);
    }
}
