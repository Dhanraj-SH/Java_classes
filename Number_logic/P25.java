import java.util.Scanner;

class P25{

    static int Square(int x){
        int res=x*x;
        return res;
    }

    static void Digit(int x){
        int y=x+1;
        int n=1;
        int z=Square(n);
        while (z<=y) { 
            if(z==y){
                System.out.println(x+" is a sunny number");
                return ;
            }
            n++;
            z=Square(n);
        }
        System.out.println(x+" is not a sunny number");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers  :");
        int x = in.nextInt();
        Digit(x);
    }
}