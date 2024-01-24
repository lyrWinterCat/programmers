package level_0;

import java.util.ArrayList;

public class NationalCompetition {
    public int solution(int[] rank, boolean[] attendance) {

        int[] rank_list = new int[rank.length];
        boolean[] attendance_list = new boolean[attendance.length];
        ArrayList<Integer> answer_list = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            rank_list[rank[i]-1]=rank[i];
            attendance_list[rank[i]-1]=attendance[i];
        }

        for (int i = 0; i < attendance_list.length; i++) {
            if(attendance_list[i]==true){
                for (int j = 0; j < rank.length; j++) {
                    if(rank[j]==rank_list[i]){
                        answer_list.add(j);
                    }
                }
            }
        }
        int answer = 10000* answer_list.get(0)+100* answer_list.get(1)+answer_list.get(2);
        return answer;
    }

    public static void main(String[] args) {
        NationalCompetition nationalCompetition = new NationalCompetition();
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = nationalCompetition.solution(rank, attendance);
        System.out.println(answer);
    }
}
