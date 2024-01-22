package level_0;

public class AntHunt {
    public int solution(int hp) {
        int answer = 0;
        int giant = hp/5;
        int middle = (hp%5)/3;
        int small = hp-(5*giant+3*middle);
        answer=giant+middle+small;
        return answer;
    }
}
