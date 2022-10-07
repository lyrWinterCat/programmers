package level_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Factorization {
    public int[] solution(int n) {
        HashSet<Integer> temp = new HashSet<>();
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                temp.add(i);
                n/=i;
            }
        }
        if(n!=1){
            temp.add(n);
        }
        System.out.println("temp = " + temp);
        ArrayList<Integer> answerArray = new ArrayList<>(temp);
        Collections.sort(answerArray);
        int[] answer = new int[answerArray.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=answerArray.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Factorization factorization = new Factorization();
        int n = 420;
        factorization.solution(n);
    }
}
