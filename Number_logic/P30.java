import java.util.Scanner;

class P30{

    static int  Palindrome(int a){
        int rev=0;
        while(a>0){
            int rem=a%10;
            a/=10;
            rev=rev*10+rem;
        }
        return rev;
    }

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int z= Palindrome(i);
            if(z==i){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range from and to  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}