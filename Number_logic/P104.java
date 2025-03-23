import java.util.Scanner;

class P104{
    static int Convert(int x,int res,int pow){
        while (x>0){
            int rem=x%2;
            res=res+(pow*rem);
            return Convert (x/2,res,pow*10);
        }
        return res;
    }
    static void Digit(int x ){
            System.out.println(Convert(x,0,1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}