package level_0;

public class RectangleWidth {
    public int solution(int[][] dots) {
        int answer = 0;
        int row1 = dots[0][0];
        int row2 = dots[0][0];
        int col1 = dots[0][1];
        int col2 = dots[0][1];
        for (int i = 0; i < dots.length; i++) {
            row1 = Math.max(row1,dots[i][0]);
            row2 = Math.min(row2,dots[i][0]);
            col1 = Math.max(col1,dots[i][1]);
            col2 = Math.min(col2,dots[i][1]);
        }
        answer = (row1-row2)*(col1-col2);
        return answer;
    }
}
