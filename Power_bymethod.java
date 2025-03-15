import java.util.Scanner;

class Power_bymethod{
    static void Power(int x,int y){
        int a=x;
        for(int i=1; i<y ;i++){
            x=x*a;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n and m ");
        int n = in.nextInt();
        int m = in.nextInt();
        Power(n,m);
    }
}