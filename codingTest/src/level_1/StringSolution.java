package level_1;

import java.util.regex.Pattern;

public class StringSolution {
    public boolean solution(String s) {
        boolean answer=false;
        String reg= "^[0-9]{4}$|^[0-9]{6}$";
        if(Pattern.matches(reg,s)){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}
