
import java.util.Scanner;

class P2{

    static void Selectionsort(int [] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++) {
                if(a[j]>a[min]){
                    min=j;
                }
                int temp=a[j];
                a[j]=a[min];
                a[min]=temp;
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
        Selectionsort(a);
    }
}