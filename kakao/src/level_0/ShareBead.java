package level_0;

import java.math.BigInteger;

public class ShareBead {
    public BigInteger solution(int balls, int share) {
        BigInteger answer;
        if(share==balls){
            answer=BigInteger.ONE;
        }else{
            BigInteger n = BigInteger.ONE;
            for (long i = share+1; i <= balls; i++) {
                n=n.multiply(BigInteger.valueOf(i));
            }
            BigInteger m = BigInteger.ONE;
            for (long i = 1; i <=balls-share ; i++) {
                m=m.multiply(BigInteger.valueOf(i));
            }
            answer = n.divide(m);
        }
        return answer;
    }
}
