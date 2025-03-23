import java.util.Scanner;

class Decimal_to_octal{
    static int Power(int x){
        int res=1;
        while(x>0){
            res=res*10;
            x--;
        }
        return res;
    }

    static void Digit(int x){
        int y=0;
        int res=0;
        while(x>0){
            int rem=x%8;
            x=x/8;
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