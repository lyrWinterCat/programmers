package level_0;

import java.util.ArrayList;

public class MakeOdd {
    public int[] solution(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i <=n ; i+=2) {
            temp.add(i);
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]= temp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeOdd makeOdd = new MakeOdd();
        int n = 10;
        makeOdd.solution(n);
    }
}
