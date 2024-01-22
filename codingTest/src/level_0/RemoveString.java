package level_0;

public class RemoveString {
    public String solution(String my_string, String letter) {

        String answer = my_string.replaceAll(letter,"");
        return answer;
    }

    public static void main(String[] args) {
        RemoveString removeString = new RemoveString();
        String my_string = "abcAbCD";
        String letter = "A";
        removeString.solution(my_string,letter);
    }
}
