package level_1;

import java.util.HashMap;

public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo){
        // 이름과 그리움 점수를 매핑하기 위한 HashMap 생성
        HashMap<String, Integer> nameToYearning = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            nameToYearning.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;

            for( String person : photo[i]){
                totalYearning += nameToYearning.getOrDefault(person, 0);
            }
            result[i] = totalYearning;

        }
        return result;


    }
}
