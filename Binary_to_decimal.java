import java.util.Scanner;

class Binary_to_decimal{
    static int Power(int x){
        int res=1;
        while(x>0){
            res=res*2;
            x--;
        }
        return res;
    }

    static void Digit(int x){
        int y=0;
        int res=0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            res=res+(Power(y)*rem);
            y++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}