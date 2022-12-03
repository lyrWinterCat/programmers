package level_1;

import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.remove();
            }
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        hallOfFame.solution(k, score);
    }
}
