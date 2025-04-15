package level_1;

public class CardsSentense {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int index1 = 0;
        int index2 = 0;

        for(String target : goal){
            // cards1의 현재 인덱스가 cards1의 길이를 초과하지 않고, cards1의 현재 인덱스에 있는 카드와 목표 카드가 같을 때
            if(index1 < cards1.length && cards1[index1].equals(target)){
                index1++;
                continue;
            }
            // cards2의 현재 인덱스가 cards2의 길이를 초과하지 않고, cards2의 현재 인덱스에 있는 카드와 목표 카드가 같을 때
            else if(index2 < cards2.length && cards2[index2].equals(target)){
                index2++;
                continue;
            }
            // 위 조건이 모두 만족하지 않으면 "No"를 반환
            else{
                return "No";
            }
        }

        return "Yes";
    }
}
