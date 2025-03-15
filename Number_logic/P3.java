import java.util.Scanner;

class P3{
    static double Power(double x , double n){
        double power=1;
        for (int i=0;i<n;i++) {
            power=(int) (power*x);
        }
        return power;
    }

    static double  Factorial(double x){
        if(x==1){
            return 1;
        }
        else{
            return x*Factorial(x-1);
        }
    }
    static void Digit(double x,double n){
        double answer=Power(x,n)/Factorial(n);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number x and n ");
        double x = in.nextDouble();
        double n = in.nextDouble();
        Digit(x,n);
    }
}