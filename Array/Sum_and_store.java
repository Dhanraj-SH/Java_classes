
import java.util.Scanner;

class Sum_and_store{
    static int Store(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            res=res+rem;
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
            a[i]=Store(a[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}