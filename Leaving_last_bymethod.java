import java.util.Scanner;

class Leaving_last_bymethod{
    static void Last(int x){
        int rem = x / 10;
        System.out.println(rem);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        Last(n);
    }
}