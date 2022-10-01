package level_0;

public class Divide_3 {
    public int solution(int num1, int num2) {
        double temp = (num1*1000)/num2;
        int answer = (int) Math.floor(temp);
        return answer;
    }
}
