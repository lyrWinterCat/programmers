package level_0;

import java.util.ArrayList;

public class ReverseArray {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = num_list.length; i >0; i--) {
            temp.add(num_list[i-1]);
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i]= temp.get(i);
        }

        return answer;
    }
}
