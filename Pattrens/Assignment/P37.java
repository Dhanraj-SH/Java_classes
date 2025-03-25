
import java.util.Scanner;

class P37{

static void Printit( int x){

        for(int i=0;i<x;i++){
            for(int j=0;j<(2*x)-1;j++){
                if(i+j==(2*(x-1))||i-j==0){
                    System.out.print((char)('A'+(x-i-1))+" ");
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
            Printit(n);
    }
}
