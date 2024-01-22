package level_2;

public class FibonacciNum {
    public int solution(int n) {
        int answer = 0;
//        int i = makeFibo(n);
//        int answer = i%1234567;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        if (n == 0) answer = arr[0];
        else if (n == 1) answer = arr[1];
        else {
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] % 1234567 + arr[i - 2] % 1234567;
                answer = arr[n] % 1234567;
            }
        }
        return answer;
    }

    private int makeFibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return makeFibo(n - 2) + makeFibo(n - 1);

    }

    public static void main(String[] args) {
        FibonacciNum fibonacciNum = new FibonacciNum();
        int n = 5;
        int solution = fibonacciNum.solution(n);
        System.out.println("solution = " + solution);
    }
}
