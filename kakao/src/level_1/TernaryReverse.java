package level_1;

public class TernaryReverse {
    public int solution(int n) {
        String intN = Integer.toString(n,3);
        String reverse="";
        for (int i = intN.length()-1; i >=0 ; i--) {
            reverse+=intN.charAt(i);
        }
        int answer = Integer.parseInt(reverse,3);
        return answer;
    }

    public static void main(String[] args) {
        TernaryReverse ternaryReverse = new TernaryReverse();
        int n = 45;
        ternaryReverse.solution(n);
    }
}
