
import java.util.Scanner;

class P13{

   static void Printit(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i+j>=x-1){
                    System.out.print(1+((i+j)-(x-1))+" ");
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
