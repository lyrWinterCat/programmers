package level_2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown+yellow;

        //brown을 구해서
        // 가로-2 * 세로-2 가 yellow가 되는 지 확인

        for (int i = area/2; i >=1 ; i--) {
            if(area%i==0){
                int row = i;
                int col = area/i;

                if((row-2)*(col-2)==yellow){
                    answer[0]=row;
                    answer[1]=col;
                    break;
                }
            }
        }

       return answer;
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        int brown = 10;
        int yello = 2;
        carpet.solution(brown,yello);
    }
}
