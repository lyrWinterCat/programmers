package level_2;

import java.util.*;

public class ProgressDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> releaseDay = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            releaseDay.add((int) (Math.ceil((100 - progresses[i]) / (double) speeds[i])));
        }

        ArrayList<Integer> answerList = new ArrayList<>();

        while (!releaseDay.isEmpty()) {
            int day = releaseDay.poll();
            int cnt = 1;

            while (!releaseDay.isEmpty()) {
                if (day >= releaseDay.peek()) {
                    cnt++;
                    releaseDay.remove();
                } else {
                    break;
                }
            }
            answerList.add(cnt);
        }

        answer = answerList.stream().mapToInt((integer) -> (int) integer).toArray();
        return answer;
    }

    public static void main(String[] args) {
        ProgressDevelop progressDevelop = new ProgressDevelop();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        progressDevelop.solution(progresses, speeds);
    }
}
