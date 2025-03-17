 import java.util.Scanner;

class P69{
    static void Digit(int x, int y){
        while(y!=0){
           int c=(x&y)<<1;
           x=x^y;
           y=c;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}