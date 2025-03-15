import java.util.Scanner;

class Summation_bymethod{

    static void Digit(int x){
        int sum =0;
        while(x>0){
            int rem = x %10;
            x/=10;
            for (int i=1; i<=rem ;i++){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        Digit(n);
    }
}