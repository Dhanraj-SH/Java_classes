import java.util.Scanner;

class Adding_at_front_bymethod{
     static int Power(int z){
        int p=1;
        for (int i=0;i<z;i++){
            p*=10;
        }
        return p;
    }
    static int Count(int l){
        int count=0;
        while(l>0){
            l=l/10;
            count++;
        }
        return count;
    }
    static int Sub(int a, int b){
        int count1=Count(a);
        int count2=Count(b);
        int count=count1-count2;
        return count;
    }
    static void Remove(int x, int y){
        int z=x%Power(Sub(x,y));
        int result=(y*Power(Count(z)))+z;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n and m");
        int n = in.nextInt();
        int m = in.nextInt();
        Remove(n,m);
    }
}