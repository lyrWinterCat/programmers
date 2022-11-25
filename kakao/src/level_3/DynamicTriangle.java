package level_3;

public class DynamicTriangle {
    public int solution(int[][] triangle) {

        for (int i = triangle.length - 1; i > 0; i--) {

            for (int j = 0; j < triangle[i].length - 1; j++) {
                triangle[i-1][j] += Math.max(triangle[i][j],triangle[i][j+1]);
            }
        }

        int answer = triangle[0][0];
//        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        DynamicTriangle dynamicTriangle = new DynamicTriangle();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        dynamicTriangle.solution(triangle);
    }
}
