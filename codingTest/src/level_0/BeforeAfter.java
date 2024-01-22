package level_0;

import java.util.HashMap;

public class BeforeAfter {
    public int solution(String before, String after) {
        HashMap<Character,Integer> beforeM = new HashMap<>();
        HashMap<Character,Integer> afterM = new HashMap<>();

        for (int i = 0; i < before.length(); i++) { //초기화
            beforeM.put(before.charAt(i),0);
            afterM.put(after.charAt(i),0);
        }

        for (int i = 0; i < before.length(); i++) {
            int tempB = beforeM.get(before.charAt(i));
            beforeM.put(before.charAt(i),++tempB);

            int tempA = afterM.get(after.charAt(i));
            afterM.put(after.charAt(i),++tempA);
        }
        System.out.println("afterM = " + afterM);
        System.out.println("beforeM = " + beforeM);
        int answer = 1;

        for (int i = 0; i < before.length(); i++) {
            if(beforeM.get(before.charAt(i))!=afterM.get(before.charAt(i))){
                answer=0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BeforeAfter beforeAfter = new BeforeAfter();
        String before = "allpe";
        String after = "apple";
        beforeAfter.solution(before,after);
    }
}
