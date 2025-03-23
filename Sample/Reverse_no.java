import java.util.Scanner;

class Reverse_no{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int rem ;
        int reverse=0;
        while (n>0){
            rem=n%10;
            n=n/10;
            reverse=(reverse*10)+rem;
        }
        System.out.println(reverse);
    }
}