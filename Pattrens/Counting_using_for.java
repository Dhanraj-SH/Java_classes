
import java.util.Scanner;

class Counting_using_for{

    static void Digit(int x){
        int count=0;
        for (int i=x;i>0;i=i/10) {
            count++;
        }
        System.out.println(count);
    } 

    public static void main (String [] args){
        Scanner val = new Scanner(System.in);
        int n=val.nextInt();
        Digit(n);
    } 
}