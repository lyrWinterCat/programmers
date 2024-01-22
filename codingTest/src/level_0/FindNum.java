package level_0;

public class FindNum {
    public int solution(int num, int k) {
        String temp = ""+num;
        int answer = 0;
        for (int i = 0; i < temp.length(); i++) {
            if(k==Integer.parseInt(""+temp.charAt(i))){
                answer=i+1;
                break;
            }else{
                answer=-1;
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        FindNum findNum = new FindNum();
        int num = 232443;
        int k = 4;
        findNum.solution(num,k);
    }
}
