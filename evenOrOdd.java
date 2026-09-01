
public class evenOrOdd {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }*/

     int evenOdd(int a){
        if(a%2==0){
            System.out.println("Even number");
            return a;
        }
        else{
            System.out.println("Odd Number");
            return a;
        }
        
    }
    public static void main(String[] args) {
        evenOrOdd eo = new evenOrOdd();
        eo.evenOdd(5);
    }

}
