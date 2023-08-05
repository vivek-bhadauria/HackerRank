import java.util.Arrays;
import java.util.List;

public class LeonardosPrimeFactors {

    public static void main(String args[]){

       long[] list = new long[]{1L, 2L, 3L, 500L, 5000L, 10000000000L, 999999999999969970L};
        for(long val : list){
            System.out.println(primeCount(val));
        }
    }

    private static int[] getPrimeNumbers (int n){

        int k = (int) Math.sqrt(n);
        int[] p = new int[n+1];
        Arrays.fill(p, 1);
        p[0]=p[1]=0;

        for(int i=2; i<=k ; i++){
            for(int j =i; i*j<=n; j++){
                p[i*j] = 0;
            }
        }
        return p;
    }

    public static int primeCount(long n) {
        int[] p = getPrimeNumbers(100);

        int m = 0;
        long prd = 1;
        for(int i =0; i<p.length; i++){
            if(prd>=n || prd < 0){
                break;
            }
            if(p[i] == 1){
                prd = prd * i;
                m++;
            }
        }
        return prd > n || prd < 0 ? m-1 : m;
    }
}
