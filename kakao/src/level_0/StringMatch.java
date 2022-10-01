package level_0;

import java.util.ArrayList;
import java.util.Collections;

public class StringMatch {
    public int[] solution(String my_string) {
        String match = "[^a-z]";
        my_string=my_string.replaceAll(match,"");
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            temp.add(Integer.parseInt(my_string.charAt(i)+""));
        }
        Collections.sort(temp);
        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=temp.get(i);
        }
        return answer;
    }
}
