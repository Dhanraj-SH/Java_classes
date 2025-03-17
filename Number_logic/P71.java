import java.util.Scanner;

class P71{
    static int Find(int x){
        int temp=9;
        while(x>0){
            int rem= x%10;
            x/=10;
            if(rem<temp){
                temp = rem;
            }
        }
    return temp;
    }
    static void Digit(int x){
        System.out.println(Find(x));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}