
import java.util.Scanner;

class P3{

    static void Insertionsort(int [] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while (j>0&&a[j]<a[j-1]) { 
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
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
        Insertionsort(a);
    }
}