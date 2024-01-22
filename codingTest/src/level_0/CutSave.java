package level_0;

public class CutSave {
    public String[] solution(String my_str, int n) {

        if(my_str.length()%n!=0){
            int addSpace = n-(my_str.length()%n);
            for (int i = 0; i < addSpace; i++) {
                my_str+=" ";
            }
        }
        String[] answer = new String[my_str.length()/n];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=my_str.substring(i*n,i*n+n);
        }
        answer[answer.length-1]=answer[answer.length-1].trim();
        for (String s : answer) {
            System.out.println("s = " + s);
        }

        return answer;
    }

    public static void main(String[] args) {
        CutSave cutSave = new CutSave();
        String my_str = "abcdef123";
        int n = 3;
        cutSave.solution(my_str,n);
    }
}
