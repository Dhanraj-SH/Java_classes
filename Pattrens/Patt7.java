
import java.util.Scanner;

class Patt7{

    static void Digit(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x/2||j==x/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    } 

    public static void main (String [] args){
        Scanner val = new Scanner(System.in);
        int n=val.nextInt();
        Digit(n);
    } 
}
