
import java.util.Scanner;

class Even_and_odd{
    public static void main(String[]args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=val.nextInt();
        int [] a= new int [n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        System.out.println();
        System.out.println("The even elements which are present in array are");
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                    System.out.print(a[i]+" ");
            }
        }
        System.out.println("The odd elements which are present in array are");
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                    System.out.print(a[i]+" ");
            }
        }
    }
}