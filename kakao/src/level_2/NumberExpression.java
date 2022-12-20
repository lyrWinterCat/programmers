package level_2;

public class NumberExpression {
    int start = 1;
    public int solution(int n) {
        int count = 0;
        int answer = makeNumber(count, n, start);

        return answer;
    }

    private int makeNumber(int count, int n, int start) {
        int sum = 0;
        if (start == n) {
            count++;
            return count;
        }
        for (int i = start; i < n; i++) {
            sum += i;
            if (sum == n) {
                count++;
                break;
            }
            if (sum > n) {
                break;
            }
        }
        start ++;
        return makeNumber(count, n, start);
    }

    public static void main(String[] args) {
        NumberExpression numberExpression = new NumberExpression();
        int n = 15;
        int solution = numberExpression.solution(n);
        System.out.println("solution = " + solution);
    }
}
