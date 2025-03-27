
import java.util.Scanner;

class P4{

    static int Sum(int [] a){
        int sum=a[0];
        for(int i=1;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=val.nextInt();
        int [] a=new int [n];
        System.out.println("Enter the values of the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        System.out.println(Sum(a));
    }
}