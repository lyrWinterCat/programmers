package level_2;

import java.util.*;
import java.util.stream.Collectors;

public class MakeBigNumber {
    public String solution(String number, int k) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < numbers.size(); i++) {

            while (!stack.isEmpty() && stack.peek() < numbers.get(i) && cnt!=k) {
                cnt++;
                stack.pop();
            }
            stack.push(numbers.get(i));
        }


        for (int i = cnt; i < k; i++) {
            stack.pop();
        }

        String answer = "";
        for (int i = 0; i < stack.size(); i++) {
            answer+=stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        String number = "4321222";
        /*
        1
        4
        4 2
        4 3
       5
       5

         */
        int k = 6;
        makeBigNumber.solution(number, k);
    }
}
