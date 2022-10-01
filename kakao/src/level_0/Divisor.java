package level_0;

import java.util.ArrayList;

public class Divisor {
    public int[] solution(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                temp.add(i);
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]= temp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Divisor divisor = new Divisor();
        int n = 24;
        divisor.solution(n);
    }
}
