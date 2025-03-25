
import java.util.Scanner;

class P122{

static void Printit( int x){
    int k=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i-j>=0){
                    k++;
                    System.out.print(k+" ");
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
