package level_0;

public class NearNum {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = n;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min,Math.abs(n-array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            if(n-min==array[i]){
                answer=n-min;
                break;
            }else{
                answer=n+min;
            }
        }
        //answer=min;
        return answer;
    }
}
