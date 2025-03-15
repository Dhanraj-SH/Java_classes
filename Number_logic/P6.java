import java.util.Scanner;

class P6{
    static void Count(int x){
        int rev=0;
        while(x>0){
            int rem= x%10;
            x=x/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number x :");
        int x = in.nextInt();
        Count(x);
    }
}