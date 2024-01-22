package level_0;

public class RepeatString {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                answer+=temp;
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        RepeatString repeatString = new RepeatString();
        String my_string="hello";
        int n=3;
        repeatString.solution(my_string,n);
    }
}
