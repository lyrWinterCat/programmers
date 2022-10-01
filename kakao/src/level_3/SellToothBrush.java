package level_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SellToothBrush {
    HashMap<String, String> workerTree = new HashMap<>();
    HashMap<String, Integer> allMoney = new HashMap<>();

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        for (int i = 0; i < enroll.length; i++) {
            workerTree.put(enroll[i], referral[i]);
            allMoney.put(enroll[i], 0); //초기화
        }

        for (int i = 0; i < seller.length; i++) {
            divisionMoney(seller[i],amount[i]*100);
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=allMoney.get(enroll[i]);
        }
        return answer;
    }

    private void divisionMoney(String seller, int money) {
        String boss = workerTree.get(seller);

        int passMoney = money/10;
//        if(passMoney<1){
//            allMoney.put(seller, allMoney.get(seller)+ money);
//            return;
//        }  문제추가조건

        int sellerMoney = allMoney.get(seller) +money-passMoney;
        allMoney.put(seller, sellerMoney);

        if(boss.equals("-")){
            return;
        }
        divisionMoney(boss, passMoney);
    }

    public static void main(String[] args) {
        SellToothBrush sellToothBrush = new SellToothBrush();
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        sellToothBrush.solution(enroll, referral, seller, amount);
    }
}
