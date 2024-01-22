package level_1;

import java.util.ArrayList;

public class MinimumNumDelete {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1){
            answer = new int[1];
            answer[0]=-1;
        }else{
            int min = arr[0];
            int idx=0;
            for (int i : arr) {
                min=Math.min(min,i);
            }
            ArrayList<Integer>temp = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
                if(arr[i]==min){
                    temp.remove(i);
                }
            }
            answer=new int[temp.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i]=temp.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MinimumNumDelete minimumNumDelete = new MinimumNumDelete();
        int[] arr = {3,6,2,9,5};
        minimumNumDelete.solution(arr);
    }
}
