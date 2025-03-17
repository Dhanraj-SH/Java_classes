import java.util.Scanner;

class P58{
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

    static void Digit(int x){
        int count=x,i=0;
        while(count>0){
            i++;
            int r=Sum(Square(i));
            if(i==r){
                count--;
            }
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}