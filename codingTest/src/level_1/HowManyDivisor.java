package level_1;

import java.util.HashSet;
import java.util.Set;

public class HowManyDivisor {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <=right ; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    temp.add(j);
                }
            }
            if(temp.size()%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return answer;
    }

}
