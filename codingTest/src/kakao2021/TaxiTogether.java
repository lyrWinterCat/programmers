package kakao2021;

import java.sql.Array;
import java.util.ArrayList;

public class TaxiTogether {

    public int solution(int n, int s, int a, int b, int[][] fares) {

        //가능한 가장 긴 길이의 경로만큼 초기화하기
       int num = 10_0000*n;

       int[][] minFee = new int[n+1][n+1];

        //초기화
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <n+1; j++) {
                if(i==j){
                    minFee[i][j]=0;
                }else{
                    minFee[i][j]=num;
                }
            }
        }

        //출발지 도착지 요금 입력
        for (int i = 0; i < fares.length; i++) {

            minFee[fares[i][0]][fares[i][1]]=fares[i][2];
            minFee[fares[i][1]][fares[i][0]]=fares[i][2];

        }


        //분기점 k
        for (int k = 1; k <n+1 ; k++) {
            for (int i = 1; i <n+1; i++) {
                for (int j = 1; j <n+1 ; j++) {
                    minFee[i][j]=Math.min(minFee[i][j],minFee[i][k]+minFee[k][j]);
                }
            }
        }

        //확인
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j < n+1; j++) {
                System.out.print(minFee[i][j]+"\t\t");
            }
            System.out.println();
        }

        int answer=num;
        for (int i = 1; i <n+1 ; i++) {
            int sum = minFee[s][i]+minFee[i][a]+minFee[i][b];
            answer=Math.min(answer,sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        TaxiTogether taxiTogether = new TaxiTogether();
        int n = 6;
        int s = 4;
        int a = 6;
        int b = 2;
        int[][] fares={{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
        System.out.println(taxiTogether.solution(n,s,a,b,fares));
    }

}
