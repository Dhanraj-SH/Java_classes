
import java.util.Scanner;

class P124{

static void Printit( int n){
    int x=n*2-1;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j>=0&&i-j>=0&&i+j<=x-1){
                    System.out.print(1+j+" ");
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
