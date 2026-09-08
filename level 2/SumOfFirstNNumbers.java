import java.util.Scanner;
public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        
    System.out.println("Enter number to add");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    /*int sum =0;
    for(int i=0;i<=num;i++){
        sum= sum+i;


    }
    System.out.println(sum);
*/
    
// without loop

int sum = num*(num+1)/2;
System.out.println(sum);


}


}
