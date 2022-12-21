package util;

import java.math.BigInteger;

public class Util {

    public static BigInteger bigFactorial(int i){
        int x = 1;
        BigInteger result = BigInteger.valueOf(1);
        while (x < i){
            result = result.multiply(BigInteger.valueOf(x));
            x++;
        }
        return result;
    }
}
