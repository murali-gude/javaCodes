public class reversingNumber {
    static int num = 12354;
    static int reverse = 0;

    public static void main(String[] args) {
        for (; num != 0; num = num / 10) {
            reverse = reverse * 10 + (num % 10);
        }

        System.out.println(reverse);
    }
}
