package level_2;

import java.util.*;
import java.util.stream.Collectors;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
//        int answer = 0;

        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            priorityQueueLowest.add(scoville[i]);
        }

        System.out.println("priorityQueueLowest = " + priorityQueueLowest);
        int count = 0;

        try{
            while (priorityQueueLowest.peek() < K) {
                int first = 0;
                count++;
                first = priorityQueueLowest.poll();
                priorityQueueLowest.add(first + priorityQueueLowest.peek() * 2);
                priorityQueueLowest.remove();
            }
        }catch(NullPointerException e){
            count = -1;
        }


        System.out.println("count = " + count);

        return count;
    }

    public static void main(String[] args) {
        MoreSpicy moreSpicy = new MoreSpicy();
        int[] scoville = {1, 2};
        int k = 7;
        moreSpicy.solution(scoville, k);
    }
}
