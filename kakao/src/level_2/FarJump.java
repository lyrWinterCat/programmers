package level_2;

import java.util.ArrayList;

public class FarJump {
    public long solution(int n) {
        long answer = 0;


        answer+=makeAnswer(n);


        return answer;
    }

    private long makeAnswer(int n) {
        int oneCnt = 0;
        int twoCnt = 0;
        while(n>0){
            
        }

        return 0;
    }

    public static void main(String[] args) {
        FarJump farJump = new FarJump();
        int n = 4;
        long solution = farJump.solution(n);
        System.out.println("solution = " + solution);
    }
}
