package level_2;

import java.util.ArrayList;

public class FarJump {
    public long solution(int n) {
        long prenum = 0;
        long num = 1;
        for (int i = 1; i <=n ; i++) {
            long nextNum = prenum + num;
            prenum = num;
            num = nextNum%1234567;
        }

        return num;
    }




    public static void main(String[] args) {
        FarJump farJump = new FarJump();
        int n = 3;
        long solution = farJump.solution(n);
        System.out.println("solution = " + solution);
    }
}
