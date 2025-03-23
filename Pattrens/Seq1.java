//0 1 2 3 4 3 2 1 0
import java.util.Scanner;

class Seq1{

    static void Digit(int x){
        int i=x*2+1;
        for(int j=0;j<i;j++){
            if(j<i/2){
                System.out.print(j+" ");
            }
            else{
                System.err.print((i-j-1)+" ");
            }
        }
    } 

    public static void main (String [] args){
        Scanner val = new Scanner(System.in);
        int n=val.nextInt();
        Digit(n);
    } 
}