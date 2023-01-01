package level_1;

import java.util.Arrays;

public class SortMyself {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] sortArray = new String[strings.length];

        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i]=strings[i].charAt(n)+strings[i];
        }

        Arrays.sort(sortArray);

        for (int i = 0; i < answer.length; i++) {
            answer[i]=sortArray[i].substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        SortMyself sortMyself = new SortMyself();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] solution = sortMyself.solution(strings, n);
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
