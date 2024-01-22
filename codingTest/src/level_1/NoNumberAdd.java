package level_1;

import java.util.ArrayList;

public class NoNumberAdd {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> temp= new ArrayList<>();
        for (int i =0; i < 10; i++) {
            temp.add(i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if(temp.contains(numbers[i])){
                temp.remove(Integer.valueOf(numbers[i]));
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            answer+=temp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        NoNumberAdd noNumberAdd = new NoNumberAdd();
        int[] numbers = {1,2,3,4,6,7,8,0};
        noNumberAdd.solution(numbers);
    }
}
