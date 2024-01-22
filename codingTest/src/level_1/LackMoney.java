package level_1;

public class LackMoney {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long payMoney=0;
        for (int i = 1; i <=count ; i++) {
            payMoney+=count*i;
        }
        System.out.println("payMoney = " + payMoney);
        if(money>=payMoney){
            answer=0;
        } else{
            answer=payMoney-money;
        }
        return answer;
    }
}
