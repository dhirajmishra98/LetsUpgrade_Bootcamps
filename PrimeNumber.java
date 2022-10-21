import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get prime number upto : ");
        int x=sc.nextInt();

        System.out.println("prime numbers are : ");
        for(int i=1; i<=x; i++){
            if(getPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    private static boolean getPrime(int n){
            if(n==1||n==0)return false;
            for(int i=2; i<n; i++){
                  if(n%i==0)return false;
            }
            return true;
    }
}
