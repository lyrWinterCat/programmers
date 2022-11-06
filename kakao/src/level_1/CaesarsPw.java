package level_1;

public class CaesarsPw {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if (now == ' ') {
                answer += (char) now;
            } else if (now >= 'a') {
                answer += (char) (((now - 'a') + n) % 26 + 'a');
            } else {
                answer += (char) (((now - 'A') + n) % 26 + 'A');
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarsPw caesarsPw = new CaesarsPw();
        String s = "a B z";
        int n = 4;
        caesarsPw.solution(s, n);
    }
}
