import java.util.Scanner;

class P7{

    static void Reverse(int [] a){
        int start=0,end=a.length-1;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
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
        Reverse(a);
    }
}