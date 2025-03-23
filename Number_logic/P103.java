import java.util.Scanner;

class P103{
    static int Sum(int x,int temp){
        while (x>0){
            int rem=x%10;
            temp=temp+rem;
            x/=10;
            return Sum (x,temp);
        }
        return temp;
    }
    static void Digit(int x ){
            System.out.println(Sum(x,0));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}