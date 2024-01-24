package level_0;

public class OverlapString {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for (int i = 0; i < s; i++) {
            answer+=my_string.charAt(i);
        }
        answer+=overwrite_string;
        for (int i = overwrite_string.length()+s; i <my_string.length(); i++) {
            answer+=my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        OverlapString overlapString = new OverlapString();
        String my_string="He11oWor1d";
        String overwrite_string="lloWorl";
        int s=2;
        String answer = overlapString.solution(my_string,overwrite_string,s);
        System.out.println("answer = " + answer);
    }
}
