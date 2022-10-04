package level_0;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class OneChar {
    public String solution(String s) {
        HashMap<Character,Integer> temp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            temp.put(s.charAt(i),0);
        }

        for (int i = 0; i < s.length(); i++) {
            int cnt = temp.get(s.charAt(i));
            temp.put(s.charAt(i),++cnt);
        }

        ArrayList<Character> charArray = new ArrayList<>();
        System.out.println("temp = " + temp);
        for (Character character : temp.keySet()) {
            Integer value = temp.get(character);
            if(value==1){
                charArray.add(character);
            }
        }
        Collections.sort(charArray);
        String answer = "";
        if(charArray.isEmpty()){
            answer="";
        }else{
            for (Character character : charArray) {
                answer+=character;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        OneChar oneChar = new OneChar();
        String s = "abcabcadc";
        oneChar.solution(s);
    }
}
