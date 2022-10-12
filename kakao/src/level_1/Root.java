package level_1;

public class Root {
    public long solution(long n) {
        long answer = 0;

        double temp = Math.sqrt(n);
        answer=temp-(int)temp==0? (long)Math.pow(temp+1,2):-1;


        return answer;
    }
}
