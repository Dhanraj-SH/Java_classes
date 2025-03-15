import java.util.Scanner;

class P7{
    static int Gcd(int a,int b){
    if(a%b==0){
        return b;
    }
    else{
        return Gcd(b, a%b);
    }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number a and b :");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(Gcd(x,y));
    }
}