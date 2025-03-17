import java.util.Scanner;

class P91{
    static int Prime(int x){
        int count=0;
        for(int i=2;i*i<x;i++){
            if(x%i==0){
                count++;
                break;
            }
        }
        return count;
    }
    static int Count(int x){
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }
        return count;
    }
    static void Digit(int x){
        int y=x;
        int count=Count(x);
        while(count>0){
            int check=Prime(x);
            if(check>0){
                System.out.println(y+" is not a Circular Prime");
                return;
            }
            int rem=x%10;
            x/=10;
            x=x*10+rem;
            count--;
        }
        System.out.println(y+" is a Circular Prime");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n  :");
        int x = in.nextInt();
        Digit(x);
    }
}