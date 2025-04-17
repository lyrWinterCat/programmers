package level_2;

import java.util.HashMap;
import java.util.Map;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 정현이가 원하는 제품과 수량을 Map에 저장
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 초기 윈도우 설정
        Map<String, Integer> discountMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }
        // 첫 번째 윈도우 확인
        boolean canBuyAll = true;
        for (String product : wantMap.keySet()) {
            if (discountMap.getOrDefault(product, 0) < wantMap.get(product)) {
                canBuyAll = false;
                break;
            }
        }

        if (canBuyAll) {
            answer++;
        }

        // discount 배열을 순회하며 10일 연속으로 원하는 제품을 모두 구매할 수 있는지 확인
        for (int i = 1; i < discount.length - 9; i++) {

            // 윈도우에서 가장 오래된 제품 제거
            String removeProduct = discount[i - 1];
            discountMap.put(removeProduct, discountMap.get(removeProduct) - 1);
            if (discountMap.get(removeProduct) == 0) {
                discountMap.remove(removeProduct);
            }

            // 윈도우에 새로 들어오는 제품 추가
            String addProduct = discount[i + 9];
            discountMap.put(addProduct, discountMap.getOrDefault(addProduct, 0) + 1);


            // 정현이가 원하는 모든 제품을 구매할 수 있는지 확인
            canBuyAll = true;
            for (String product : wantMap.keySet()) {
                if (discountMap.getOrDefault(product, 0) < wantMap.get(product)) {
                    canBuyAll = false;
                    break;
                }
            }

            if (canBuyAll) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        할인행사 solution = new 할인행사();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {
                "chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"
        };
        int result = solution.solution(want, number, discount);
        System.out.println("Number of valid discounts: " + result); // Expected output: 3
    }
}
