
import java.util.Scanner;

class Swap_e_and_o{

    public static void main(String[]args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=val.nextInt();
        int [] a= new int [n];
        int [] b= new int [n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
            b[i]=a[i];
        }
        int k=0,j=1;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b[k]=a[i];
                k++;
            }
            else{
                b[(n/2)+(j-1)]=a[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}