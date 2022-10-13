package level_1;

public class HashadNum {
    public boolean solution(int x) {
        boolean answer = true;
        String temp = ""+x;
        int add=0;
        for (int i = 0; i < temp.length(); i++) {
            add+=Integer.parseInt(""+temp.charAt(i));
        }
        if(x%add!=0){
            answer=false;
        }

        return answer;
    }
}
