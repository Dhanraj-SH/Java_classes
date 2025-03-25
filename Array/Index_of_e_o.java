
import java.util.Scanner;

class Index_of_e_o{
    public static void main(String[]args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=val.nextInt();
        int [] a= new int [n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        System.out.println("The Index of even no");
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                    System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("The Index of odd no");
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                    System.out.print(i+" ");
            }
        }
    }
}