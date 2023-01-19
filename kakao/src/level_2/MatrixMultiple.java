package level_2;

public class MatrixMultiple {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2[0].length ; j++) {
                System.out.println("i,j = "+ i +" "+ j);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MatrixMultiple matrixMultiple = new MatrixMultiple();
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        int[][] solution = matrixMultiple.solution(arr1, arr2);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }

    }
}
