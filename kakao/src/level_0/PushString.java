package level_0;

public class PushString {
    public int solution(String A, String B) {
        int answer = 0;
        int cnt = 0;
        String newA=A;
        if(A.equals(B)){
            answer=0;
        }else{
            for (int i = 1; i <= A.length(); i++) {
                newA=moveString(newA);
                System.out.println("newA = " + newA);
                if(newA.equals(B)){
                    answer=i;
                    break;
                }else{
                    answer=-1;
                }
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    private String moveString(String A) {
        String newString = ""+A.charAt(A.length()-1);
        for (int i = 0; i < A.length()-1; i++) {
            newString+=A.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        PushString pushString = new PushString();
        String A = "a";
        String B = "a";
        pushString.solution(A,B);
    }
}
