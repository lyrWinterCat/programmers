package level_0;

public class EatPizza {
    public int solution(int slice, int n) {
        //slice*answer>=n
        //answer>=n/slice 올림
        int answer=0;
        if(n%slice==0){
            answer=n/slice;
        }else{
            answer=n/slice+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        EatPizza eatPizza = new EatPizza();
        int slice=7;
        int n = 10;
        eatPizza.solution(slice,n);
    }

}
