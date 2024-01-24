package level_0;

import java.util.*;

public class RandomKNumber {
    public int[] solution(int[] arr, int k) {
        Stack<Integer> arr_stack = new Stack<>();
        arr_stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr_stack.contains(arr[i])){
                continue;
            }else{
                arr_stack.push(arr[i]);
            }
        }

        System.out.println(arr_stack);

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            if(i<arr_stack.size()){
                answer[i]=arr_stack.get(i);
            }else{
                answer[i]=-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RandomKNumber randomKNumber = new RandomKNumber();
        int[] arr = {0,1,0,1};
//        int[] arr = {0, 1, 1, 1,1};
//        int[] arr = {1, 2, 2, 0,0};
        int k = 6;
        int[] answer = randomKNumber.solution(arr,k);
        System.out.println(Arrays.toString(answer));
    }
}
