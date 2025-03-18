import java.util.Scanner;

class P94{
    static  long Power(long x){
        long res=1;
        while(x>0){
            res=res*2;
            x--;
        }
        return res;
    }

    static long Fermet(long x) {
        return Power(Power(x))+1;
    }
    static long Digit(long x){
        long n=0;
        while(x>0){
            System.out.println(Fermet(n));
            n++;
            x--;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        long x = in.nextLong();
        Digit(x);
    }
}