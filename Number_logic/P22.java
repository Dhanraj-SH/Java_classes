import java.util.Scanner;

class P22{

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
    static void Neon(int x){
        int y=Sum(Square(x));
        if(x==y){
            System.out.println(x+" is a Neon number");
        }
        else{
           System.out.println(x+" is not a Neon number"); 
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers  :");
        int x = in.nextInt();
        Neon(x);
    }
}