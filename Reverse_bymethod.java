import java.util.Scanner;

class Reverse_bymethod{
    static void Reverse(int x){
        int reverse=0;
        while(x>0){
            int rem = x %10;
            x=x/10;
            reverse=reverse*10+rem;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        Reverse(n);
    }
}