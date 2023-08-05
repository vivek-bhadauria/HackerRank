import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {

        int[] arr = getPrimeNumbers(100);
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 1){
                System.out.println(i);
            }
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
}