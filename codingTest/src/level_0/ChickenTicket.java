package level_0;

public class ChickenTicket {
    int coupon = 0;

    public int solution(int chicken) {
        int answer = 0;

//        answer = makeServiceChicken(chicken);

        int coupon = 0;
        coupon = chicken;
        while(coupon>=10){
            answer+=coupon/10;
            coupon = coupon/10 + coupon%10;
        }

        System.out.println("answer = " + answer);


        return answer;
    }

//    private int makeServiceChicken(int chicken) {
//
//        if(chicken<10){
//            return 0;
//        }
//
//        return chicken / 10 + makeServiceChicken(chicken / 10 + chicken % 10);
//    }


    public static void main(String[] args) {
        ChickenTicket chickenTicket = new ChickenTicket();
        int chicken = 100;
        chickenTicket.solution(chicken);
    }
}
