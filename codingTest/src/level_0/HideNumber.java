package level_0;

public class HideNumber {
    public int solution(String my_string) {
        int answer = 0;
        String match = "[^0-9]";
        my_string = my_string.replaceAll(match, " ");
        my_string = my_string.trim();
        my_string = my_string.replaceAll("\\s+", " ");
        if (my_string.isEmpty()) {
            return answer;
        } else {
            String[] s = my_string.split(" ");
            for (int i = 0; i < s.length; i++) {
                answer += Integer.parseInt(s[i]);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        HideNumber hideNumber = new HideNumber();
        String my_string = "asefasefaesf";
        hideNumber.solution(my_string);
    }
}
