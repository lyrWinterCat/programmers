package level_2;

public class SpinNumber {

    public int[] solution(int rows, int columns, int[][] queries) {

        int[] answer = new int[queries.length];

        int[][] basicNum = new int[rows][columns];
        for (int i = 1; i < rows+1; i++) {
            for (int j = 1; j < columns+1; j++) {
                basicNum[i-1][j-1]=(i-1) * columns + j;
            }
        }

        for (int j = 0; j < queries.length; j++) {
            int[] query = queries[j];

            int startRow = query[0] - 1;
            int endRow = query[2] - 1;
            int startC = query[1] - 1;
            int endC = query[3] - 1;

            int temp = basicNum[startRow][startC];
            int min = temp;

            for (int i = startRow; i < endRow; i++) {
                basicNum[i][startC] = basicNum[i + 1][startC];
                min=Math.min(min,basicNum[i][startC]);
            }
            for (int i = startC; i < endC; i++) {
                basicNum[endRow][i] = basicNum[endRow][i + 1];
                min=Math.min(min,basicNum[endRow][i]);
            }
            for (int i = endRow; i >startRow; i--) {
                basicNum[i][endC] = basicNum[i-1][endC];
                min=Math.min(min,basicNum[i][endC]);
            }
            for (int i = endC; i >startC; i--) {
                basicNum[startRow][i]=basicNum[startRow][i-1];
                min=Math.min(min,basicNum[startRow][i]);
            }
            basicNum[startRow][startC+1]=temp;
            answer[j]=min;

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(basicNum[i][j]+"  ");
            }
            System.out.println();
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }

        return answer;
    }

    public static void main(String[] args) {
        SpinNumber spinNumber = new SpinNumber();
        int rows=3;
        int columns = 3;
        int [][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        spinNumber.solution(rows,columns,queries);
    }
}
