import java.util.Scanner;

class P5{
    static void Count(int x){
        int sum=0;
        while(x>0){
            int rem= x%10;
            x=x/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number x :");
        int x = in.nextInt();
        Count(x);
    }
}