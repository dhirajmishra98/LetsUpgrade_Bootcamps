import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter value of n : ");
        x = sc.nextInt();
        System.out.println(fac(x));

        sc.close();
    }

    private static int fac(int x){
        int fact = 1;
        for(int i=x;i>0;i--){
            fact = fact*i;
        }
        return fact;
    }
}

