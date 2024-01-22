package level_0;

public class EatLamb {
    public int solution(int n, int k) {
        int answer = 0;
        answer+=12000*n+(k-(n/10))*2000;
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        EatLamb eatLamb = new EatLamb();
        int n = 64;
        int k = 6;
        eatLamb.solution(n,k);
    }
}
