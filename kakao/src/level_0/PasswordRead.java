package level_0;

public class PasswordRead {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 1; i < cipher.length()/code; i++) {
            answer+=cipher.charAt((code-1)*i);
        }
        return answer;
    }
}
