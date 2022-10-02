package level_0;

public class MakeBig {
    public int solution(int[] numbers) {
        int max=-10000*10000;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                max = Math.max(max,numbers[i]*numbers[j]);
            }
        }
        int answer = max;
        return answer;
    }
}
