import java.util.Scanner;

class First{
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
    static void Add(int x, int y){
        y=(y * Power(Count(x)))+x;
        System.out.println(y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n and m");
        int n = in.nextInt();
        int m = in.nextInt();
        Add(n,m);
    }
}