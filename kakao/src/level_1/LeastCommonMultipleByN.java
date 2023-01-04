package level_1;

public class LeastCommonMultipleByN {
    public int solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[0] = makemakeLeastCommonMultiple(arr[0], arr[i]);
        }
        return arr[0];
    }

    private int makemakeLeastCommonMultiple(int num1, int num2) {
        int max = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                max=i;
            }
        }
        return (num1*num2)/max;
    }

    public static void main(String[] args) {
        LeastCommonMultipleByN leastCommonMultipleByN = new LeastCommonMultipleByN();
        int[] arr = {1,2,3};
        int solution = leastCommonMultipleByN.solution(arr);
        System.out.println("solution = " + solution);
    }
}
