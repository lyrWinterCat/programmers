package level_1;

public class MakeMinSquare {
    public int solution(int[][] sizes) {
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }

        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            max1 = Math.max(max1,sizes[i][0]);
            max2 = Math.max(max2,sizes[i][1]);
        }

        return max1*max2;
    }

    public static void main(String[] args) {
        MakeMinSquare makeMinSquare = new MakeMinSquare();
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        makeMinSquare.solution(sizes);
    }
}
