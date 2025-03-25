
import java.util.Scanner;

class P7{

   static void Printit(int n){
    int x= 2*n-1;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j>=x/2&&i-j<=0&&i+j>=x-1){
                    System.out.print((i >= (x/2) ? (x/2)+(i-j) :(x/2)-(i+j-(x-1)))+" ");
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
        String c=val.nextLine();
            char n=c.charAt(0);
            Printit(n);
    }
}
