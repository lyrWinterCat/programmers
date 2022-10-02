package level_0;

public class EatPizzas {
    public int solution(int n) {

        int temp = getLcm(n,6);
//        System.out.println("temp = " + temp);
        int answer=temp/6;
        return answer;
    }

    private int getLcm(int n, int m) {
        return n*m/makeGcb(n,m);
    }

    private int makeGcb(int n, int m) {
        int minNum1 = Math.min(n,m);
        while(true){
            if(n%minNum1==0&&m%minNum1==0){
                return minNum1;
            }
            minNum1-=1;
        }
    }


    public static void main(String[] args) {
        EatPizzas eatPizzas = new EatPizzas();
        int n = 10;
        eatPizzas.solution(n);
    }
}
