public class largestNumber {

    /*static int largest (int a, int b){
        if (a>b){
            return a;
        } else if (b>a) {
            return b;
        } else {
            return a; // or return b; since they are equal
        }}

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = largest(num1, num2);
        System.out.println("The largest number is: " + result);
        }*/


    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int largest = (num > num2) ? num : num2;
        System.out.println("The largest number is: " + largest);
    }
    
}
