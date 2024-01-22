package level_1;

public class StringToNum {
    public int solution(String s) {
        int answer = 0;
        boolean minus = false;
        if(s.charAt(0)=='-'){
            minus=true;
        }
        s=s.replaceAll("[^0-9]","");
        answer=Integer.parseInt(s);
        if(minus){
            answer*=-1;
        }

        return answer;
    }
}
