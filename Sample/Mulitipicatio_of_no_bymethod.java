import java.util.Scanner;

class Mulitipication_of_no_bymethod{
    static int Digit(int x){
        int sum=1;
        while(x>0){
            int rem= x%10;
            x/=10;
            sum=sum*rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        System.out.println(Digit(n));
    }
}