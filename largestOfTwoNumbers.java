import java.util.*;
public class largestOfTwoNumbers {
    /*public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        System.out.println("Enter C");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is largest");
        } else if (b >= a && b >= c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }*/

    static int largeNumbers(int a, int b, int c){
        if (a >= b && a >= c) {
            System.out.println("A is largest");
            return a;
        } else if (b >= a && b >= c) {
            System.out.println("B is largest");
            return b;
        } else {
            System.out.println("C is largest");
            return c;
        }
    }

    public static void main(String[]args){
        largeNumbers(10,25,88);
    }
}
