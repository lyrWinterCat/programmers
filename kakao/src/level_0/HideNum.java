package level_0;

public class HideNum { //정규식을 써서 풀어도 좋을듯
    public int solution(String my_string) {
        char zero = '0';
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);

            if(temp>=65){
                StringBuilder sb = new StringBuilder(my_string);
                sb.setCharAt(i,zero);
                my_string=sb.toString();
            }
            answer+=Integer.parseInt(my_string.charAt(i)+"");
        }
        return answer;
    }
}
