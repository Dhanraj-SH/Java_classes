
import java.util.Scanner;

class P19{

static void Printit( int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i-j<=0){
                    System.out.print((char)(('A'+x-1)-i)+" ");
                }    
                else{
                    System.out.print(" ");
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
