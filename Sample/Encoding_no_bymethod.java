import java.util.Scanner;

class Encoding_no_bymethod{
    static int Reverse(int x){
        int reverse=0;
        while(x>0){
            int rem = x %10;
            x=x/10;
            reverse=reverse*10+rem;
        }
        return reverse;
    }
    static void Digit(int x){
        int y=Reverse(x);
        while(y>0){
            int rem = y %10;
            y/=10;
            System.out.print((rem%2==0)? 0: 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        Digit(n);
    }
}