import java.util.Scanner;

class Remove_last_bymethod{
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
    static int Extra(int a, int b){
        for(int i=0;i<b;i++){
            a=a/10;
        }
        return a;
    }
    static void Add(int x, int y){
        x=(Extra(x,Count(y)) * Power(Count(y)))+y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n and m");
        int n = in.nextInt();
        int m = in.nextInt();
        Add(n,m);
    }
}