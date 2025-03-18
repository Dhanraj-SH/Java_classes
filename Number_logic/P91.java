import java.util.Scanner;

class P91{
    static  int Power(int x){
        int res=1;
        while(x>0){
            res=res*10;
            x--;
        }
        return res;
    }
    static int Prime(int x) {
        if (x < 2) return 0; 
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return 0; 
            }
        }
        return 1; 
    }
    static int Count(int x){
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }
        return count;
    }
    static void Digit(int x) {
        int y = x;
        int count = Count(x);
        int power = Power(count - 1); 

        for (int i = 0; i < count; i++) {
            if (Prime(x) == 0) {
                System.out.println(y + " is not a Circular Prime");
                return;
            }
            int rem = x % 10;
            x = (rem * power) + (x / 10); 
        }
        System.out.println(y + " is a Circular Prime");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n  :");
        int x = in.nextInt();
        Digit(x);
    }
}