package level_0;

public class ChangeChar {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            temp = (char) (temp<97? temp+32:temp-32); //소문자 a를 기준으로 해도 됨
            answer+=temp;

        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        ChangeChar changeChar = new ChangeChar();
        String my_string = "cccCCC";
        changeChar.solution(my_string);

    }
}
