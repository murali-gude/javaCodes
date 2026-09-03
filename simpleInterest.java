import java.util.*;
public class simpleInterest {
public static void main(String[] args) {

       /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
         int Principle = sc.nextInt();
        System.out.println("Enter Time Period");
         int Time = sc.nextInt();
        System.out.println("Enter Rate of interest");
         int Rate = sc.nextInt();

        int simpleInterst = ((Principle * Time * Rate)/100);
        System.out.println(simpleInterst + " total Simple Interest");
    }*/

        static int si( int p, int r, int t){
            int simpleInterst = ((Principle * Time * Rate)/100);
            System.out.println(simpleInterst + " total Simple Interest");
            return simpleInterst;
        }

        public static void main(String [] args){
            int simpleInterst = si(1000,14,2);
            System.out.println(simpleInterst + " total Simple Interest");
        }

}
