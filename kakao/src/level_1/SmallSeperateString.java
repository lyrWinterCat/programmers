package level_1;

public class SmallSeperateString {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long piece = Long.parseLong(t.substring(i,i+p.length()));
            if(Long.parseLong(p)>=piece){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SmallSeperateString smallSeperateString = new SmallSeperateString();
        String t = "10203";
        String p = "15";
        int solution = smallSeperateString.solution(t, p);
        System.out.println("solution = " + solution);
    }
}
