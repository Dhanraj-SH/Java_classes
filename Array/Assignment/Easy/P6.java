import java.util.Scanner;

class P6{

    static int Count(int [] a,int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x) return 1;
        }
        return 0;        
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
        System.out.println("Enter the number need to be checked");
        int x=val.nextInt();
        System.out.println((Count(a, x)==0?"The "+x+" is not present":"The "+x+" is present"));
    }
}