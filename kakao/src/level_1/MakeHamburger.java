package level_1;

/*
주어진 배열 내
1 2 3 1 이 몇 개 있는지 확인
한 번 1 2 3 1 이 돌았다면 해당 1 2 3 1을 빼고 처음부터 배열을 돌아서
다시 1 2 3 1 이 있는 지 확인 (빵 야채 고기 빵)
재귀? 스택?
 */

import java.util.Stack;

public class MakeHamburger {
    public int solution(int[] ingredient) {

        String hamburger = "1231";
        StringBuilder ingredientsSB = new StringBuilder();
        int count = 0;

        for (int i = 0; i < ingredient.length; i++) {
            ingredientsSB.append(ingredient[i]);
            String sub = ingredientsSB.substring(Math.max(0,ingredientsSB.length()-4));

            if(sub.equals(hamburger)){
                count++;
                ingredientsSB.delete(ingredientsSB.length()-4,ingredientsSB.length());
            }
        }



//        while (ingredientsSB.toString().contains(hamburger)) {
//            count++;
//            ingredientsSB.delete(ingredientsSB.indexOf(hamburger), ingredientsSB.indexOf(hamburger) + 4);
//        }


//        String ingredients = ingredientsSB.toString();
//        int count1 = 0;
//        while(true){
//            ingredients = ingredients.replaceFirst(hamburger,"");
//            count++;
//            if(!ingredients.contains(hamburger)){
//                break;
//            }
//
//        }

        return count;
    }

    public static void main(String[] args) {
        MakeHamburger makeHamburger = new MakeHamburger();
        int[] ingredient = {1, 2, 1, 2, 3, 1, 3, 1};

        int solution = makeHamburger.solution(ingredient);
        System.out.println("solution = " + solution);
    }
}
