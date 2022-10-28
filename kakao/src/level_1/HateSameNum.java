package level_1;

import java.util.Stack;

public class HateSameNum {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(stack.peek()!=arr[i]){
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        HateSameNum hateSameNum = new HateSameNum();
        int[] arr = {1,1,3,3,0,1,1};
        hateSameNum.solution(arr);
    }
}
