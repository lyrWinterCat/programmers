package level_0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Calculate {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = Integer.parseInt(s[0]);
        for (int i = 1; i < s.length-1; i++) {
            if(i%2==1 && s[i].equals("+")){
                answer+=Integer.parseInt(s[i+1]);
            }else if(i%2==1 && s[i].equals("-")){
                answer-=Integer.parseInt(s[i+1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        String my_string = "30 + 42 - 18";
        calculate.solution(my_string);
    }
}
