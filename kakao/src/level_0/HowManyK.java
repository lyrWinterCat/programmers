package level_0;

public class HowManyK {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <=j; l++) {
            String temp = ""+l;
            System.out.println("temp = " + temp);

        }
        return answer;
    }

    public static void main(String[] args) {
        HowManyK howManyK = new HowManyK();
        int i = 1;
        int j = 13;
        int k = 1;
        howManyK.solution(i,j,k);
    }
}
