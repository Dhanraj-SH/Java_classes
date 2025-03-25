
import java.util.Scanner;

class Product{
    static int Product(int sum,int n){
        return sum*n;
    }
    public static void main(String[]args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=val.nextInt();
        int [] a= new int [n];
        int sum=1;
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=Product(sum, a[i]);
        }
            System.out.print(sum+" ");
    }
}