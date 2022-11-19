package level_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {
    public String solution(int[] numbers) {
        String answer = "";

        List<String> number = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.toList());

        number.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return - Integer.parseInt(o1+o2) + Integer.parseInt(o2+o1);
                return -(o2+o1).compareTo(o1+o2);
            }

        });
        StringBuilder sb = new StringBuilder();

        for (String s : number) {
            sb.append(s);
        }
        answer = sb.toString();

        if(answer.charAt(0)=='0'){
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();
        int[] numbers = {6,10,2};
        maxNumber.solution(numbers);
    }
}
