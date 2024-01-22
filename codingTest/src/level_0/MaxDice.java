package level_0;

public class MaxDice {
    public int solution(int[] box, int n) {
        int answer = (box[0]/n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
}
