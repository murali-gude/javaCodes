public class leapYear {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year to check leap year or not");
         int year = sc.nextInt();
         if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
             System.out.println(year + " is a leap year");
         } else {
             System.out.println(year + " is not a leap year");
         }
        
    }*/

         static void leapyear(int year){
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
             System.out.println(year + " is a leap year");
         } else {
             System.out.println(year + " is not a leap year");
         }

         }
         public static void main(String[] args) {
             leapyear(2003);
         }

}
