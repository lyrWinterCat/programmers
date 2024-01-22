package level_0;

public class DoubleArray {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i]=numbers[i]*2;
        }

        return answer;
    }

    public static void main(String[] args) {
        DoubleArray doubleArray = new DoubleArray();
        int[] numbers = {1,2,3,4,5};
        doubleArray.solution(numbers);
    }
}
