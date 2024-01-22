package level_0;

import java.util.ArrayList;

public class CutArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = num1; i <=num2; i++) {
            temp.add(numbers[i]);
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=temp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        CutArray cutArray = new CutArray();
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        cutArray.solution(numbers,num1,num2);
    }
}
