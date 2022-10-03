package level_0;

public class CutPaper {
    public int solution(int M, int N) {
        int answer = (M-1)+(N-1)*(M);
        if(M==1 && N==1){
            answer=0;
        }
        return answer;
    }

    public static void main(String[] args) {
        CutPaper cutPaper = new CutPaper();
        int M = 2;
        int N = 2;
        cutPaper.solution(M,N);
    }
}
