package level_0;

import java.util.ArrayList;
import java.util.HashMap;

public class WhatIsMode {
    public int solution(int[] array) {
        int answer = 0;

        int[] arrayCount = new int[1000];
        int max = 0;
        int index = -1;
        int cnt=0;

        for (int i = 0; i < array.length; i++) {
            arrayCount[array[i]]++;
            max = Math.max(max, arrayCount[array[i]]);
        }

        //중복검사
        for (int i = 0; i < arrayCount.length; i++) {
            if(max==arrayCount[i]){
                index=i;
                cnt++;
            }

        }

        if(cnt>=2){
            return -1;
        }
        return index;
    }

    public static void main(String[] args) {
        WhatIsMode whatIsMode = new WhatIsMode();
        int[] array = {1,1,2,2};
        int solution = whatIsMode.solution(array);
        System.out.println("solution = " + solution);
    }
}
