package level_0;

import java.math.BigInteger;

public class BinaryNumAdd {
    public String solution(String bin1, String bin2) {
        BigInteger bin_1 = new BigInteger(bin1,2);
        BigInteger bin_2 = new BigInteger(bin2,2);

        BigInteger sum = bin_1.add(bin_2);
        String answer = sum.toString(2);
        return answer;
    }
}
