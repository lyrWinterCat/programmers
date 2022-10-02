package level_0;

public class CompositionNum {
    int count=0;
    public int solution(int n) {
        for (int i = 1; i <=n; i++) {
            isPrime(i);
        }
        System.out.println("count = " + count);
        int answer = n-count-1;
        return answer;
    }

    private void isPrime(int number) {
        if(number<2){
            return;
        }
        if(number==2){
            count++;
            return;
        }
        for (int i = 2; i <number; i++) {
            if(number%i==0){
                return;
            }
        }
        count++;
        return;
    }

    public static void main(String[] args) {
        CompositionNum compositionNum = new CompositionNum();
        int n = 100;
        compositionNum.solution(n);
    }
}
