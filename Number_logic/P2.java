import java.util.Scanner;

class P2{
    static double  Factorial(double x){
        if(x==1){
            return 1;
        }
        else{
            return x*Factorial(x-1);
        }
    }
    static void Digit(double x){
        double answer=1/Factorial(x);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        double n = in.nextDouble();
        Digit(n);
    }
}