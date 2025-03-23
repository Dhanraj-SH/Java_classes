import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int m = n;
        int rem ;
        int reverse=0;
        while (n>0){
            rem=n%10;
            n=n/10;
            reverse=(reverse*10)+rem;
        }
        if(m==reverse){
            System.out.println("The "+ reverse + " is a palandromic number");
        }
        else {
            System.out.println("The "+ reverse + " is not a palandromic number"); 
        }
    }
}