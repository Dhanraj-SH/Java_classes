import java.util.Scanner;

class P15{
    static int Fact(int x){
        if(x==1){
            return 1;
        }
        else{
            return x*Fact(x-1);
        }
    }
    static void Digit(int x){
        int y=x;
        int r=0;
        while(y>0){
            int rem= y%10;
            y/=10;
            r=r+Fact(rem);
        }
        if(r==x){
            System.out.println(x+" is a Strong number");
        }
        else{
            System.out.println(x+" is not a Strong number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}