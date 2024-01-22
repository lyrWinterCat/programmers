package level_1;

public class Autoreverse {
    public int[] solution(long n) {
        String temp = ""+n;
        int[] answer = makeAnswer(temp);

        return answer;
    }
    private int[] makeAnswer(String temp) {
        int[] answer = new int[temp.length()];
        for (int i = temp.length()-1; i >=0; i--) {
            answer[4-i]=Integer.parseInt(""+temp.charAt(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        Autoreverse autoreverse = new Autoreverse();
        long n = 12345;
        autoreverse.solution(n);
    }
}
