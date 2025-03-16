import java.util.Scanner;

class P40{

    static int Square(int x){
        int y=x*x;
        return y;
    }

    static int Sum(int x){
        int res=0;
        while(x>0){
            int rem= x%10;
            x/=10;
            res=res+rem;
        }
        return res;
    }

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
        int r=Sum(Square(i));
        if(i==r){
            System.out.println(i);
        }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range from and to  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}