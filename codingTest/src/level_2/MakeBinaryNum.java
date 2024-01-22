package level_2;

import static java.lang.Integer.toBinaryString;

public class MakeBinaryNum {
    int cnt = 0;
    int zeroCnt = 0;

    public int[] solution(String s) {
        int[] answer = new int[2];
        makeBinaryOne(s);

        answer[0]=cnt;
        answer[1]=zeroCnt;

        return answer;
    }

    private void makeBinaryOne(String s) {
        if(s.equals("1")){
            return;
        }

        cnt++;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                zeroCnt++;
            }
        }
        s = toBinaryString(s.replaceAll("0","").length());
        makeBinaryOne(s);
    }

    public static void main(String[] args) {
        MakeBinaryNum makeBinaryNum = new MakeBinaryNum();
        String s = "110010101001";
        makeBinaryNum.solution(s);
    }
}
