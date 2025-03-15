import java.util.Scanner;

class P11{
    static int  Digit(int a){
        int rev=0;
        while(a>0){
            int rem=a%10;
            a/=10;
            rev=rev*10+rem;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        int y=Digit(x);
        if (x==y) {
            System.out.println(x+" is a palindrome");
        }
        else{
            System.out.println(x+" is not a Palindrome");
        }
    }
}