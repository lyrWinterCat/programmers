package level_1;

import java.util.*;

public class Phoneketmon {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }

        if(nums.length/2 < numsSet.size()){
            answer = nums.length/2;
        }else if(nums.length/2 >= numsSet.size()){
            answer = numsSet.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        Phoneketmon phoneketmon = new Phoneketmon();
        int[] nums = {3,3,3,2,2,4};
        phoneketmon.solution(nums);
    }
}
