package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMulti {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n==0){
                temp.add(numlist[i]);
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=temp.get(i);
        }

        return answer;
    }
}
