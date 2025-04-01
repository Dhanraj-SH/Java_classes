import java.util.Arrays;
import java.util.Scanner;

class P13{

    static void Duplicate(int [] a){
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if (a[i]==a[i-1]) {
                System.out.println(a[i]);
                return ;
            }
        }
        System.err.println("There is no duplicate present");
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=val.nextInt();
        int [] a=new int [n];
        System.out.println("Enter the values of the array A");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        Duplicate(a);
    }
}