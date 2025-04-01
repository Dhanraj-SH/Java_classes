
import java.util.Scanner;

class P1{

    static int Max(int [] a){
        int temp=a[0];
        for(int i=0;i<a.length;i++){
            if(temp<a[i]){
                temp=a[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=val.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        System.out.println(Max(a));
    }
}