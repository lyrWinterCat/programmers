package level_1;

public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length ; i++) {
            if(food[i]!=1 && food[i]!=0){
                for (int j = 0; j < food[i]/2; j++) {
                    answer+=i;
                }
            }
        }
        answer+=0;
        for (int i = food.length-1; i >0 ; i--) {
            if(food[i]!=1 && food[i]!=0){
                for (int j = 0; j < food[i]/2; j++) {
                    answer+=i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FoodFight foodFight = new FoodFight();
        int[] food = {1,7,1,2};
        String solution = foodFight.solution(food);
        System.out.println("solution = " + solution);
    }
}
