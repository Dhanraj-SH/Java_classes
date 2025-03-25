
import java.util.Scanner;

class Mod{

    public static void main(String[]args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=val.nextInt();
        int [] a= new int [n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        for(int i=0;i<n;i++){
            a[i]=a[i]%n;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}