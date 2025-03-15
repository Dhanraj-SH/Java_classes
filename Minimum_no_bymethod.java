import java.util.Scanner;

class Minimum_no_bymethod{
    static int Digit(int x){
        int result=0;
        while(x>0){
            int rem= x%10;
            x/=10;
            if(rem<=result){
                result= rem;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        System.out.println(Digit(n));
    }
}