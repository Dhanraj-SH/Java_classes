import java.util.Scanner;

public class P80{

    static long Reverse(long n) {
        long rev = 0;
        while (n > 0) {
            long rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }

    static int Lychrel(long n) {
        int count = 500;
        while (count > 0) {
            long reverse = Reverse(n);
            long sum = n + reverse;
            if (sum == Reverse(sum)) {
                return 1; 
            }
            n = sum;
            count--;
        }
        return 0; 
    }

    static void Digit(int x) {
        for (int i = 1; i <= x; i++) {
            if (Lychrel(i) == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number range: ");
        int x = in.nextInt();

        Digit(x);
    }
}
