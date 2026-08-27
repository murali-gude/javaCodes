
import java.util.Scanner;

public class addTwoNumbers {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 to add: ");

        int num1=sc.nextInt();
        System.out.println("Enter num2 to add: ");
        int num2=sc.nextInt();
        int sum=sum(num1, num2);
        System.out.println("Sum: " + sum);
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }

}
