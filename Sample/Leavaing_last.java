import java.util.Scanner;

class Leaving_last{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = val.nextInt();
        int m = n / 10;
        System.out.println("The last digit of the  number "+ m);
    }
}