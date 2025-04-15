package level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Tangerine2 {
    public int solution(int k, int[] tangerine){
        HashMap<Integer, Integer> sizeCount = new HashMap<>();

        for(int size:tangerine){
            sizeCount.put(size, sizeCount.getOrDefault(size, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(sizeCount.values());

        Collections.sort(counts, Collections.reverseOrder());

        int totalSelected = 0;
        int typeCount = 0;

        for(int count:counts){
            totalSelected += count;
            typeCount++;

            if(totalSelected >= k){
                break;
            }
        }
        return typeCount;
    }
}
