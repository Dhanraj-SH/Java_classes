import java.util.Scanner;

class Positive_or_negative{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = val.nextInt();
        if (n>0){
            System.out.println("The number is positive");
        }
        else if (n==0){
            System.out.println("The number is zero");
        }
        else {
            System.out.println("The number is negative");
        }
        }
}