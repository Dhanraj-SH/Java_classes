
import java.util.Scanner;

class P111{

static void Printit( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<4*x;j++){
            if(i-j==0||i+j==x-1||i-j==-(x-1)||i+j==2*(x-1)||i-j==-2*(x-1)||i+j==3*(x-1)||i-j==-3*(x-1)||i+j==4*(x-1)){
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
            Printit(n);
    }
}
