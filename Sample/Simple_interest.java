import java.util.Scanner;

class Simple_interest{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the principal:");
        Float p = val.nextFloat();
        System.out.println("Enter the rate:");
        Float r = val.nextFloat();
        System.out.println("Enter the time in years:");
        int t = val.nextInt();

        Float SI = (p*t*r)/100;
        System.out.println("The simple interest is "+ SI);
    }
}