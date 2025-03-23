
import java.util.Scanner;

class Multiply_using_while{

    static void Digit(int x){
        int i=1;
        while(i<=10){
            System.out.println(x*i);
            i++;
        }
    } 

    public static void main (String [] args){
        Scanner val = new Scanner(System.in);
        int n=val.nextInt();
        Digit(n);
    } 
}