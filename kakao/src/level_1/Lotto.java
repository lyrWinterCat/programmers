package level_1;

import java.util.HashMap;

public class Lotto {
/*
lottos : 내가 뽑은 숫자. 0은 아직 모르는 숫자
win_num : 1등 당첨 번호
6개 다 일치 >> 1등
2개 번호가 일치 >> 5등
그 외 : 낙

내가 뽑은 숫자에서 가능한 최고/최저 순위
 */

    public int[] solution(int[] lottos, int[] win_nums) {
        //0은 무엇이든지 다 될 수 있음
        // lottos에서 0을 제외한 숫자가 win_num과 몇개가 겹치는지

        int same=0;
        int unknown=0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(win_nums[i]==lottos[j]){
                    same++;
                }
            }
            if(lottos[i]==0){
                unknown++;
            }
        }

        HashMap<Integer,Integer> ranking = new HashMap<>();
        for (int i = 6; i >0; i--) {
            ranking.put(i,7-i); //key = 일치한 갯수, value = 등수
        }
        ranking.put(0,6);

        int[] answer = new int[2];
        answer[0]=ranking.get(same+unknown);
        answer[1]=ranking.get(same);

        return answer;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        int[] lottos={45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        lotto.solution(lottos,win_nums);
    }

}
