package level_2;

import static java.lang.Integer.toBinaryString;

public class NextBigNum {
    public int solution(int n) {
        int answer = 0;
        String binaryN = toBinaryString(n);

        int cntOne=countOne(binaryN);

        for (int i = n+1; i <=1_000_000 ; i++) {
            String newBinary = toBinaryString(i);
            int newBinarycntOne = countOne(newBinary);
            if(newBinarycntOne==cntOne){
                answer=i;
                break;
            }
        }
        return answer;
    }

    private int countOne(String binaryN) {
        int cnt=0;
        char[] charArr = binaryN.toCharArray();
        for (char c : charArr) {
            if(c=='1'){
                cnt++;
            }
        }
        return cnt;
        //        return (int) binaryN.chars().filter(c->c=='1').count();
    }


    public static void main(String[] args) {
        NextBigNum nextBigNum = new NextBigNum();
        int n = 78;
        int solution = nextBigNum.solution(n);
        System.out.println("solution = " + solution);
    }
}
