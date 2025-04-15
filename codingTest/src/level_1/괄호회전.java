package level_1;

import java.util.Stack;

public class 괄호회전 {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();

        // 문자열 길이만큼 반복하여 모든 회전의 경우 확인
        for (int i = 0; i < length; i++) {
            // 회전된 문자열 생성
            String rotated = s.substring(i) + s.substring(0, i);
            System.out.println(rotated);
            // 괄호의 유효성을 검사
            if (isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }


    private boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        괄호회전 solution = new 괄호회전();
        String s = "}]()[{";
        int result = solution.solution(s);
        System.out.println("Valid rotations: " + result); // Expected output: 3
    }
}
