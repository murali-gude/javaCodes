public class countDigitsInANumber {

    // initilizing number
    static int n = 123456;

    // initilizing counter
    static int count = 0;

    public static void main(String[] args) {
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

}
