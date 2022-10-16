package level_1;

import java.util.ArrayList;

public class AddNum {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long a = x;
        long b = x;
        for (int i = 0; i < n; i++) {
            answer[i]=a;
            a+=b;
        }

        return answer;
    }

    public static void main(String[] args) {
        AddNum addNum = new AddNum();
        int x = 0;
        int n = 2;
        addNum.solution(x,n);
    }
}
