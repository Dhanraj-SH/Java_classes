import java.util.Scanner;

class First{
    static int Reverse(int x, int res) {
        if (x == 0) {
            return res;
        }
        int rem = x % 10;
        return Reverse(x / 10, res * 10 + rem);
    }

    static void Digit(int x){
        System.out.println(Reverse(x,0));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}