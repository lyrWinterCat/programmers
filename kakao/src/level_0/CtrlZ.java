package level_0;

import java.util.ArrayList;
import java.util.Stack;

public class CtrlZ {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        for (String s1 : s.split(" ")) {
            if(s1.equals("Z")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s1);
            }
        }

        int answer = 0;
        for (int i = 0; i < stack.size(); i++) {
            answer+=Integer.parseInt(stack.elementAt(i));
        }
//        System.out.println("answer = " + answer);
        return answer;
    }




    public static void main(String[] args) {
        CtrlZ ctrlZ = new CtrlZ();
        String s = "1 2 3 Z Z";
        ctrlZ.solution(s);
    }
}
