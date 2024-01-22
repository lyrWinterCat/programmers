package level_0;

import java.util.HashMap;

public class StrangeAge {
    public String solution(int age) {

        HashMap<Integer,Character> temp= new HashMap<>();
        for (int i = 0; i < 10; i++) {
            temp.put(i,(char)(97+i));
        }

        String ageS = ""+age;
        String answer = "";
        for (int i = 0; i < ageS.length(); i++) {
            answer+=temp.get(Integer.parseInt(""+ageS.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        StrangeAge strangeAge = new StrangeAge();
        int age = 23;
        strangeAge.solution(age);
    }
}
