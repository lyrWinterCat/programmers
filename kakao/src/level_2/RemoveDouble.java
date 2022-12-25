package level_2;

import java.util.Stack;

public class RemoveDouble {
    public int solution(String s) {
        int answer = -1;

        Stack<Character> stringStack = new Stack<>();

//        char temp = ' ';
//
//        for (char c : s.toCharArray()) {
//            if (!stringStack.isEmpty() && stringStack.peek().equals(c)) {
//                temp = stringStack.peek();
//                stringStack.pop();
//            } else if (temp != c) {
//                stringStack.push(c);
//                temp = ' ';
//            }
//        }

        for (int i = 0; i < s.length(); i++) {

            if (!stringStack.isEmpty() && stringStack.peek() == s.charAt(i)) {
                stringStack.pop();
                continue;
            }

            stringStack.push(s.charAt(i));
        }

        System.out.println("stringStack = " + stringStack);


        if (stringStack.isEmpty()) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        RemoveDouble removeDouble = new RemoveDouble();
        String s = "baabaa";
        int solution = removeDouble.solution(s);
        System.out.println("solution = " + solution);
    }
}
