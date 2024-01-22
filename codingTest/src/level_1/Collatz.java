package level_1;

public class Collatz {
    long temp =0;
    public int solution(int num) {
        int answer = -1;
        int cnt=0;
        temp=num;

        if(num==1){
            answer=0;
        }else if(num!=1){
            while(temp!=1){
                ++cnt;

                if(temp%2==0){
                    temp=temp/2;
                }else{
                    temp=temp*3+1;
                }
            }
        }
        if(cnt>=500){
            answer=-1;
        }else{
            answer=cnt;
        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        int num =626331;
        collatz.solution(num);
    }
}
