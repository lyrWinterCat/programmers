package level_1;

import java.util.ArrayList;
import java.util.Collections;

public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> cut = new ArrayList<>();
            for (int j =commands[i][0]-1; j < commands[i][1]; j++) {

                cut.add(array[j]);
            }
            Collections.sort(cut);
            answer[i]=cut.get(commands[i][2]-1);
            cut.clear();
        }
        return answer;
    }

    public static void main(String[] args) {
        Knumber knumber = new Knumber();
        int[] array = {1,5,2,6,3,7,4};
        int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        knumber.solution(array,commands);
    }




}
