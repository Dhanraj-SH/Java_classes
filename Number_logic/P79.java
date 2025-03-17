import java.util.Scanner;

class P78{
    static int Power(int x){
        int res=1;
        for(int i=0;i<x;i++){
            res=res*10;
        }
        return res;
    }
    static int Count(int x){
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }    
        return count;
    }
    static int Kaprekar(int x){
        int count=Power(Count(x)+1/2);
        int square=x*x;
        int front= square/(count);
        int back= square%(count);
        return front +back;
    }
    static void Digit(int x){
        for(int i=1;i<=x;i++){
            if(i==Kaprekar(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}