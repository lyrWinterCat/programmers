package level_0;

public class StringIntoString {
    public int solution(String str1, String str2) {
        boolean check = str1.contains(str2);
        int answer = 1;
        if(!check){
            answer=2;
        }
        return answer;
    }
}
