package level_1;

import java.util.HashSet;

public class 합의개수 {public int solution(int[] elements) {
    int n = elements.length;
    HashSet<Integer> sumSet = new HashSet<>();

    for (int len = 1; len<=n; len++){
        for ( int start = 0; start < n; start++){
            int sum = 0;
            for (int i = 0; i < len; i++){
                sum += elements[(start + i)%n];
            }
            sumSet.add(sum);
        }

    }


    return sumSet.size();
}
}
