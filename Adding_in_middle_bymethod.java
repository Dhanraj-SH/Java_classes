import java.util.Scanner;

class Adding_in_middle_bymethod{
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
    static int Sub(int a){
        int count=Count(a)/2;
        return count;
    }
    static void Mid(int x, int y){
        int back=x%Power(Sub(x));
        int front=x/Power(Sub(x));
        int half=front*Power(Count(y))+y;
        int result=half*Power(Count(back))+back;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n and m");
        int n = in.nextInt();
        int m = in.nextInt();
        Mid(n,m);
    }
}