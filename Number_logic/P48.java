import java.util.Scanner;

class P48{
    static int  Palindrome(int a){
        int rev=0;
        while(a>0){
            int rem=a%10;
            a/=10;
            rev=rev*10+rem;
        }
        return rev;
    }

    static void Digit(int x){
        int count=x,i=0;
        while(count>0){
            i++;
            int z= Palindrome(i);
            if(z==i){
                count--;
            }
        }
        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}