package level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisionZero {

    public int[] solution(int[] arr, int divisor) {
        int[] answer={};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : arr) {
            if(i%divisor==0){
                temp.add(i);
            }
        }


        if(temp.size()==0){
            answer = new int[1];
            answer[0]=-1;
        }else{
            answer = new int[temp.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i]=temp.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }

}
