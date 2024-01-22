package level_1;

import java.util.Arrays;

public class ReturnString {
    public String solution(String s) {
        String answer = "";
        int[] temp = new int[s.length()];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=s.charAt(i);
        }
        Arrays.sort(temp);
        for (int i = temp.length-1; i >=0; i--) {
            char tempC = (char)temp[i];
            answer+=tempC;
        }
        return answer;
    }

    public static void main(String[] args) {
        ReturnString returnString = new ReturnString();
        String s = "Zbcdefg";
        returnString.solution(s);
    }
}
