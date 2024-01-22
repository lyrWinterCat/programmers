package level_0;

public class MaxNum {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max,array[i]);
        }
        answer[0]=max;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==max){
                answer[1]=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxNum maxNum = new MaxNum();
        int[] array = {1,8,3};
        maxNum.solution(array);
    }
}
