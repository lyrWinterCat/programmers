package level_0;

import java.util.HashSet;

public class ParallelLine {
    public int solution(int[][] dots) {
        HashSet<Double> slope = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i+1; j < dots.length; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                slope.add(makeSlope(dots[i],dots[j]));
            }
        }

        System.out.println("slope = " + slope);

        if(slope.size()!=6){
            return 1;
        }
        return 0;
    }

    private Double makeSlope(int[] dot1, int[] dot2) {
        double y = dot2[1]-dot1[1];
        double x = dot2[0]-dot1[0];
        return (double)y/x;
    }

    public static void main(String[] args) {
        ParallelLine parallelLine = new ParallelLine();
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        parallelLine.solution(dots);
    }
}
