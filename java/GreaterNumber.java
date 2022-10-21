import java.util.*;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        int a = sc.nextInt(), b = sc.nextInt(), c= sc.nextInt();

        if(a>b && a>c) System.out.println("greater Number : "+a);
        else if(b>c && b>a) System.out.println("greater Numbre : "+b);
        else System.out.println("greater number : "+c);
        sc.close();
    }
}
