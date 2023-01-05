package level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class SaveBoat {
    public int solution(int[] people, int limit) {
        int start = 0;
        int end = people.length - 1;
        Arrays.sort(people);
        int boat = 0;
        int answer2 = 0;
        while (start <= end) {
            boat = people[start] + people[end];
            answer2++;
            if (boat > limit) {
                end--;
            }
            if (boat <= limit) {
                start++;
                end--;
            }
        }
        System.out.println("answer2 = " + answer2);

        int start3 = 0;
        int end3 = people.length - 1;
        int answer3 = 0;
        while (start3 <= end3) {
            answer3++;
            if (people[start3] + people[end3] <= limit) {
                start3++;
            }
            end3--;
        }
        System.out.println("answer3 = " + answer3);


        return answer2;
    }

    public static void main(String[] args) {
        SaveBoat saveBoat = new SaveBoat();
        int[] people = {70, 80, 50};
        int limit = 100;
        int solution = saveBoat.solution(people, limit);
        System.out.println("solution = " + solution);
    }
}
