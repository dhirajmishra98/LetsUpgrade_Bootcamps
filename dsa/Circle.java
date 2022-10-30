import java.util.*;

// Write a Program to find area of a circle using Function, take input from the user
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int r = sc.nextInt();
        System.out.println(area(r));

        sc.close();
    }

    private static double area(int r){
        return 3.14*r*r;
    }
}
