package level_0;

public class MovingDots {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0}; //가,세

        int row = (board[0]-1)/2;
        int col = (board[1]-1)/2;

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]){
                case "left":
                    if(answer[0]==row*-1){
                        break;
                    }else{
                        answer[0]-=1;
                    }
                    break;
                case "right":
                    if(answer[0]==row){
                        break;
                    }else{
                        answer[0]+=1;
                    }
                    break;
                case "up":
                    if(answer[1]==col){
                        break;
                    }else{
                        answer[1]+=1;
                    }
                    break;
                case "down":
                    if(answer[1]==col*-1){
                        break;
                    }else{
                        answer[1]-=1;
                    }
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MovingDots movingDots = new MovingDots();
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int [] board = {7,9};
        movingDots.solution(keyinput,board);
    }
}
