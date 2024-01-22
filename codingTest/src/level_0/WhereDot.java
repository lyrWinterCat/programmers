package level_0;

public class WhereDot {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer = 0;

        if(x>0 && y>0){
            answer=1;
        } else if(x>0 && y<0){
            answer=4;
        } else if(x<0 && y<0){
            answer=3;
        }else{
            answer=2;
        }

        return answer;
    }
}
