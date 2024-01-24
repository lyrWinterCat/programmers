package level_0;

public class MakeSquare {
    public int[][] solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        int row = arr.length;
        int col = arr[0].length;

        if(row>col){
            int[][] answer = new int[row][row];
            return getInts(arr, row, answer);

        }else if(row<col){
            int[][] answer = new int[col][col];
            return getInts(arr, col, answer);

        }else{
            return arr;
        }
    }

    private int[][] getInts(int[][] arr, int col, int[][] answer) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    answer[i][j]=arr[i][j];
                } catch (Exception e) {
                    answer[i][j]=0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeSquare makeSquare = new MakeSquare();
//        int[][] arr = {{572,22,37},{287,726,384},{85,137,292},{487,13,876}};
        int[][] arr = {{57,192,534,2},{9,345,192,999}};
//        int[][] arr = {{1,2},{3,4}};
        int[][] answer = makeSquare.solution(arr);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.println(answer[i][j]);
            }
        }
    }
}
