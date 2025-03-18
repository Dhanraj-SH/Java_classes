import java.util.Scanner;

class P95{
    static int Cube(int x) {
        return x * x * x;
    }

    static void Digit(int x) {
        int num = 1;
        while (num <= x) {
            int a = 1, count = 0;
            while (Cube(a) < num) {
                int b = a;
                while (Cube(a) + Cube(b) <= num) {
                    if (Cube(a) + Cube(b) == num) {
                        count++;
                    }
                    b++;
                }
                a++;
            }
            if (count > 1) {
                System.out.println(num);
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range:");
        int x = in.nextInt();
        Digit(x);
    }
}
