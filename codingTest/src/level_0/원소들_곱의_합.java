package level_0;

public class 원소들_곱의_합 {
    public int solution(int[] num_list) {
        int answer=0;

        int multiply = 1;
        int sum = 0;

        for (int i = 0; i < num_list.length; i++){
            multiply *= num_list[i];
            sum += num_list[i];
        }

        sum = sum * sum;

        if (multiply < sum){
            answer = 1;
        } else if (multiply == sum){
            answer = 0;
        } else {
            answer = -1;
        }


        return answer;
    }
}
