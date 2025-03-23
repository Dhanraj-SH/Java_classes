
import java.util.Scanner;

class Odd_or_even{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of the N");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        }
}