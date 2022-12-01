package level_1;

import java.util.HashMap;

public class KnightWeapon {
    public int solution(int number, int limit, int power) {
        int answer = 0;

//        HashMap<Integer,Integer> knights = new HashMap<>();
//        for (int i = 1; i <= number; i++) {
//            knights.put(i,0);
//        }
//        for (Integer weapon : knights.keySet()) {
//            for (int i = 1; i <=weapon ; i++) {
//                if(weapon%i==0){
//                    knights.put(weapon,knights.get(weapon)+1);
//                }
//            }
//            if(knights.get(weapon)>limit){
//                knights.put(weapon,power);
//            }
//            answer+=knights.get(weapon);
//        }
        int [] knights = new int[number+1];

        for (int i = 1; i < knights.length; i++) {
            knights[i] = findPower(i, limit, power);
            answer+=knights[i];
        }

        return answer;
    }

    private int findPower(int number,int limit,int power) {
        int result = 0;
        double sqrt = Math.sqrt(number);
        for (int i = 1; i <=sqrt ; i++) {
            if(number%i==0){
                result++;
            }
        }
        if(sqrt%1==0){
            result = (result*2) - 1;
        } else{
            result = result * 2;
        }

        if(result>limit){
            result=power;
        }
        return result;
    }

    public static void main(String[] args) {
        KnightWeapon knightWeapon = new KnightWeapon();
        int number = 10;
        int limit = 3;
        int power = 2;
        int solution = knightWeapon.solution(number, limit, power);
        System.out.println("solution = " + solution);
    }
}
