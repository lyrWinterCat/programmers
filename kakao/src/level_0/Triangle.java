package level_0;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle {
    public int solution(int[] sides) {
        int answer = 2;

        ArrayList<Integer> temp = new ArrayList<>();
        for (int side : sides) {
            temp.add(side);
        }
        Collections.sort(temp);
        if(temp.get(2)<temp.get(0)+temp.get(1)){
            answer=1;
        }
        return answer;
    }
}
