import java.util.Scanner;

class P12{

    static void Missing(int [] a){
        int n=a.length;
        int Sum=(n*(n+1))/2;
        for (int i=0;i<a.length;i++) {
            Sum= Sum-a[i];
        }
        if(Sum==0){
            System.err.println(n+1);
        }
        else{
            System.err.println(Sum);
        }
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
        Missing(a);
    }
}