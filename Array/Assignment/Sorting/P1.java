
import java.util.Scanner;

class P1{

    static void Bubblesort(int [] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
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
        Bubblesort(a);
    }
}