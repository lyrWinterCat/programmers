package level_1;

import java.util.Arrays;
import java.util.HashSet;

public class ChosenTwoAndAdd {
    public int[] solution(int[] numbers) {
        HashSet<Integer> addNumbers = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                addNumbers.add(numbers[i]+ numbers[j]);
            }
        }
        int[] answer = new int[addNumbers.size()];
        Integer[] answerInteger = addNumbers.toArray(new Integer[0]);

        for (int i = 0; i < answerInteger.length; i++) {
            answer[i]=answerInteger[i];
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        ChosenTwoAndAdd chosenTwoAndAdd = new ChosenTwoAndAdd();
        int[] numbers = {5,0,2,7};
        int[] solution = chosenTwoAndAdd.solution(numbers);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
