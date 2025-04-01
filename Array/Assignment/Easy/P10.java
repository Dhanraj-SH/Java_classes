import java.util.Scanner;

class First{

    static void Merge(int [] a,int [] b){
        int n=a.length+b.length;
        int [] c =new int[n];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        for(int i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=val.nextInt();
        int [] a=new int [n];
        int [] b=new int [n];
        System.out.println("Enter the values of the array A");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        System.out.println("Enter the values of the array B");
        for(int i=0;i<n;i++){
            b[i]=val.nextInt();
        }
        Merge(a,b);
    }
}