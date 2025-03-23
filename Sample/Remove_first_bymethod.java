import java.util.Scanner;

class Remove_first_bymethod{
    static int Power(int z){
        int p=1;
        for (int i=1;i<z;i++){
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

    static void Remove(int x){
        x=x%Power(Count(x));
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n and m");
        int n = in.nextInt();
        Remove(n);
    }
}