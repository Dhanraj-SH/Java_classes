
import java.util.Scanner;

class P123{

static void Printit( int x){
    int k=1;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i-j>=0){
                    System.out.print(k+" ");
                    k=(k<9?k+1:1);
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
