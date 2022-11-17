package level_2;

import java.util.Stack;

public class CorrectBracket {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(') {
                stack.push(bracket);
            }
            if (bracket == ')' ){
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CorrectBracket correctBracket = new CorrectBracket();
        String s = "(()())())";
        correctBracket.solution(s);
    }
}
