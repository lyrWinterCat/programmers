package level_1;

public class CommonDivisor {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max=0;
        for (int i = 1; i <=n && i<=m; i++) {
            if(n%i==0 && m%i==0){
                max=i;
            }
        }
        int min = (n*m)/max;
        answer[0]=max;
        answer[1]=min;

        return answer;
    }
}
