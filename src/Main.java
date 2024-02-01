import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <=n / 2 ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int[] primeFactors(int n){
        if (isPrime(n)){
            return new int[0];
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                if (isPrime(i)){
                    primeNumbers.add(i);
                }
            }
        }
        int[] primeNumbersArray = new int[primeNumbers.size()];
        for (int i = 0; i < primeNumbers.size(); i++) {
            primeNumbersArray[i] = primeNumbers.get(i);
        }
        return primeNumbersArray;
    }
}