package level_0;

import java.util.Arrays;

public class ContinuousNumberAdd {
    public int[] solution(int num, int total) {
        int addNum=0;
        for (int i = 1; i < num ; i++) {
            addNum+=i;
        }
        int firstAnswer = (total-addNum)/num;

        int[] answer = new int[num];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=firstAnswer+i;
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousNumberAdd continuousNumberAdd = new ContinuousNumberAdd();
        int [] answer = continuousNumberAdd.solution(5, 5);
        System.out.println(Arrays.toString(answer));
    }
}
