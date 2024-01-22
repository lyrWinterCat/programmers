package level_0;

public class ChangeArray {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int temp = 0;
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j]=num_list[temp];
                temp++;
//                System.out.println("answer[i][j] = " + answer[i][j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ChangeArray changeArray = new ChangeArray();
        int[] num_list = {1,2,3,4,5,6,7,8};
        int n = 2;
        changeArray.solution(num_list,n);
    }
}
