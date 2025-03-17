import java.util.Scanner;

class P83{
    static long Catalan(int x) {
        long res = 1;
        for (int i = 0; i < x; i++) {
            res = res * (2 * (2 * i + 1)) / (i + 2);  
        }
        return res;
    }

    static void Digit(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(Catalan(i));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        Digit(n);
}
}
