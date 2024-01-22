package level_0;

public class Factorial {
    int temp = 1;
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <=10; i++) {
            temp*=i;
//            System.out.println("temp = " + temp);
            if(temp<=n){
                answer=i;
            }
        }
//        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int n = 3628800;
        factorial.solution(n);
    }
}
