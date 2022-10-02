package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayString {
    public String solution(String my_string) {

        my_string = my_string.toLowerCase();
        char[] temp = my_string.toCharArray();
        Arrays.sort(temp);
        String answer=new String(temp);
        return answer;
    }
}
