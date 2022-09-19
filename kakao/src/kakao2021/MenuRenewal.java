package kakao2021;


/*
1. 주문한 알파벳을 중복 없이 하나로 만든다.
2. ex) ABCDE로 order 개수에 맞게 가능한 모든 배열의 수를 구함
3. 손님의 주문에 맞춰 모든 order 개수 구함
4. 비교를 통해 주문수가 2개 이상인 배열 추출
5. 출력

 */

import java.util.*;
import java.util.stream.Stream;

public class MenuRenewal {

    String menuResult="";
    String userResult="";
    HashMap<String,Integer> courseMenu = new HashMap<>(); //menu로 가능한 모든 메뉴배열

    public String[] solution(String[] orders, int[] course) {

        HashSet<String> menu = new HashSet<String>();
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < orders[i].length(); j++) {
                menu.add(String.valueOf(orders[i].charAt(j)));

            }
        }
        System.out.println(menu); //sort 해주기

        ArrayList<String> sortedMenu = new ArrayList<>(menu); //set > list로 변환
        Collections.sort(sortedMenu); //정렬
        System.out.println("sortedMenu = " + sortedMenu);

        //course[i]에 따라 course[i]개수만큼 메뉴가 들어있는 배열 생성
        for (int i = 0; i < course.length; i++) {

            for (int j = 0; j < course[i]; j++) {
                int num = course[i];
                makeCourse(sortedMenu, num, 0, 0);

            }
        }
        System.out.println("courseMenu = " + courseMenu);

        //사용자 코스메뉴 만들기 >> courseMenu에 담기
        // makeUserCourse(orders[i], course[j], int start, int dept)
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < course.length; j++) {
                String userMenu = orders[i];
                char[] chars = userMenu.toCharArray();
                Arrays.sort(chars);
                orders[i] = new String (chars);
                makeUserMenu(orders[i], course[j], 0, 0);
            }
        }

        System.out.println("courseMenu = " + courseMenu);

        ArrayList<String> lastMenu = new ArrayList<>();
        for (int i = 0; i < courseMenu.size(); i++) {
            courseMenu.values().removeAll(Collections.singleton(0));
            courseMenu.values().removeAll(Collections.singleton(1));
        }
        System.out.println("courseMenu = " + courseMenu); //여기에서 orders 수에 따라 주문 수가 가장 큰 주문들만 남기기
        // 새 리스트를 만들어 넣어주는 편이 나중에 정렬하기 좋겠지

        String[] answer = {};


        return answer;
    }

    private void makeUserMenu(String orders, int course, int start, int dept) {
        int orderSize = orders.length();
        if(userResult.length()==course){

            if(courseMenu.containsKey(userResult)){
                courseMenu.put(userResult,courseMenu.get(userResult)+1);
            }else{
                courseMenu.put(userResult,0);
            }
            return;
        }
        for (int i = start; i <orders.length() ; i++) {
            userResult+=orders.charAt(i);
            makeUserMenu(orders,course,i+1,dept++);
            userResult=userResult.substring(0,userResult.length()-1);
        }
    }

    private void makeCourse(ArrayList<String> sortedMenu,int num, int start, int dept) {
        int menuNum = sortedMenu.size();
        if(menuResult.length()==num){
            courseMenu.put(menuResult,0);
            return;
        }
        for (int i = start; i < sortedMenu.size() ; i++) {
            menuResult+=sortedMenu.get(i);
            makeCourse(sortedMenu,num,i+1,dept++);
            menuResult=menuResult.substring(0,menuResult.length()-1);
        }
    }

    public static void main(String[] args) {
        MenuRenewal menuRenewal = new MenuRenewal();
        String [] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int [] cource = {2,3,5};
        String[] answer = menuRenewal.solution(orders,cource);
        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }

}
