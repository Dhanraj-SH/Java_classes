import java.util.Scanner;

class Print_even_bymethod{
    static int Reverse(int x){
        int reverse=0;
        while(x>0){
            int rem = x %10;
            x=x/10;
            reverse=reverse*10+rem;
        }
        return reverse;
    }
    static int Digit(int x){
        int count=0;
        int y=Reverse(x);
        int ans=0;
        while(y>0){
            int rem=y%10;
            y/=10;
            if(rem%2==0){
               ans=ans*10+rem; 
                count++;
            }
        }
        System.out.println(count);
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        System.out.println(Digit(n)+",");
    }
}