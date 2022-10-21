import java.util.*;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt(), b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a : "+a);
        System.out.println("b : "+b);

        sc.close();
    }
}
