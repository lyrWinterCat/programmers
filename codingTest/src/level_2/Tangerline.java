package level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Tangerline {
    public int solution(int k , int[] tangerine) {
            // 각 귤 크기별 개수를 저장할 HashMap 생성
            // 키: 귤의 크기, 값: 해당 크기의 귤 개수
            HashMap<Integer, Integer> sizeCount = new HashMap<>();

            // 배열을 순회하며 각 크기별 귤의 개수 계산
            for (int size : tangerine) {
                // getOrDefault: 해당 키가 있으면 값을 가져오고, 없으면 기본값(0)을 반환
                // 기존 개수에 1을 더해 다시 저장
                sizeCount.put(size, sizeCount.getOrDefault(size, 0) + 1);
            }

            // HashMap의 값(각 크기별 귤의 개수)만 추출하여 리스트로 변환
            List<Integer> counts = new ArrayList<>(sizeCount.values());

            // 귤 개수를 내림차순으로 정렬
            // 개수가 많은 크기의 귤부터 선택하면 종류 수를 최소화할 수 있음
            Collections.sort(counts, Collections.reverseOrder());

            // 지금까지 선택한 귤의 총 개수
            int totalSelected = 0;
            // 선택한 귤의 종류(크기) 수
            int typeCount = 0;

            // 개수가 많은 종류부터 차례로 선택
            for(int count : counts) {
                // 현재 종류의 귤을 모두 선택
                totalSelected += count;
                // 선택한 종류 수 증가
                typeCount++;

                // 목표 개수(k)를 달성했거나 초과했으면 종료
                if (totalSelected >= k) {
                    break;
                }
            }

            // 선택한 귤의 종류 수 반환
            return typeCount;
    }
}
