package level_0;

public class Avg {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum=0;
        for (double number : numbers) {
            sum+=number;
        }
        answer=sum/numbers.length;
        return answer;
    }
}
