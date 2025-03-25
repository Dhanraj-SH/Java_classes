
import java.util.Scanner;

class Search{
    public static void main(String[]args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=val.nextInt();
        int [] a= new int [n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        System.out.println("Enter the element need to be searched");
        int m=val.nextInt();
        for(int i=0;i<n;i++){
            if(m==a[i]){
                System.out.println("The elemnt "+m+" is present in the "+i+" index");
                return;
            }
        }
        System.out.println("The element is not present");
    }
}