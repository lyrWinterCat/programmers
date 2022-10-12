package level_1;

public class CountPY {
    boolean solution(String s) {
        boolean answer = false;
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if('p'==s.charAt(i)|| 'P'==s.charAt(i)){
                p++;
            }else if('y'==s.charAt(i)||'Y'==s.charAt(i)){
                y++;
            }
        }
        if(p==y){
            answer=true;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
