import java.math.*;

public class BigInteger1 {
    public static void main(String[] args) {
        System.out.println("50! \n "+factorial(50));
    }
    public static BigInteger factorial(long n){
        BigInteger result= BigInteger.ONE;
        for(int i=1;i<=n;i++){
            result=result.multiply(new BigInteger(i+""));

        }
        return result;
    }
}
