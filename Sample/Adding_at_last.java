import java.util.Scanner;

class Adding_at_last{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n = val.nextInt();
        System.out.println("Enter the 2nd number");
        int m = val.nextInt();
        int rem;
        while(m>0){
            rem = m % 10;
            m = m / 10;
            n=(n*10)+rem;
        }
        System.out.println("The last digit of the  number "+ n);
    }
}