package level_1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int budgetSum = 0;
        for (int i = 0; i < d.length; i++) {
            budgetSum+=d[i];
            if(budgetSum<=budget){
                answer++;
            }
        }
        return answer;
    }
}
