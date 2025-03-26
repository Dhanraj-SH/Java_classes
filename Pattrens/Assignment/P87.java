
import java.util.Scanner;

class P87{

static void Printit( int x){

        for(int i=0;i<x;i++){
            int k=1;
            for(int j=0;j<x;j++){ 
                if(j%2!=0){
                    System.out.print(1+i+" ");
                }    
                else{
                    System.out.print(k+" ");
                    k++;
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
