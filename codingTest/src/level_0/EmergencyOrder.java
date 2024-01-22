package level_0;

import level_1.CommonDivisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EmergencyOrder {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        HashMap<Integer,Integer> order = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            order.put(emergency[i],0);
        }
        int[] temp = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            temp[i]=emergency[i];
        }
        
        Arrays.sort(emergency);
        
        for (int i = emergency.length-1; i >=0; i--) {
            order.put(emergency[i],5-i);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i]=order.get(temp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        EmergencyOrder emergencyOrder = new EmergencyOrder();
        int [] emergency = {30,10,23,6,100};
        emergencyOrder.solution(emergency);
    }
}
