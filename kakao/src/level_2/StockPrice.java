package level_2;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {

            for (int j = i+1; j < prices.length; j++) {
                answer[i]++;
                if(prices[i]>prices[j]){
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        int[] prices = {1,2,3,2,3};
        stockPrice.solution(prices);
    }
}
