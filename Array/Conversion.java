
import java.util.Scanner;

class Convertion{
    static int Convert(int n){
        int res=0;
        int p=1;
        while(n>0){
            int rem=n%2;
            n/=2;
            res=res+(p*rem);
            p*=10;
        }
        return res;
    }
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
            a[i]=Convert(a[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}