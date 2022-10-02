package level_0;

public class TSNGame {
    public int solution(int order) {
        String temp = ""+order;
        int answer = 0;
        for (int i = 0; i < temp.length(); i++) {
            if(Integer.parseInt(""+temp.charAt(i))==3 || Integer.parseInt(""+temp.charAt(i))==6 || Integer.parseInt(""+temp.charAt(i))==9){
                answer++;
            }
        }
        return answer;
    }
}
