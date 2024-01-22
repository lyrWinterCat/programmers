package level_0;

public class ReverseString {
    public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length(); i>0; i--){
            answer+=my_string.charAt(i-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String my_string = "aabbccdef";
        reverseString.solution(my_string);
    }
}
