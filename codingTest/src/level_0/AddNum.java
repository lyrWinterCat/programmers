package level_0;

public class AddNum {
    public int solution(int n) {
        String temp = ""+n;
        int answer = 0;
        for(int i=0; i<temp.length(); i++){
            char tempC = temp.charAt(i);
            answer+=Integer.parseInt(String.valueOf(tempC));
        }

        return answer;
    }
}
