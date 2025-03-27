import java.util.Scanner;

class P9{

    static void Reverse(int [] a){
        int f=a[0],s=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<f){
                s=f;
                f=a[i];
            }
            else if(a[i]!=f&&a[i]<s){
                    s=a[i];
            }
        }
        System.out.println(s);
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
        Reverse(a);
    }
}