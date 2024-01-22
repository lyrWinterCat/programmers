package level_0;

public class VirusDouble {
    public int solution(int n, int t) {
        int answer=n;

        for (int i = 0; i <t; i++) {
            int temp =(int) (n*Math.pow(2,i));
            answer+=temp;
        }
        return answer;
    }



    public static void main(String[] args) {
        VirusDouble virusDouble = new VirusDouble();
        int n = 7;
        int t = 15;
        virusDouble.solution(n,t);
    }


}
