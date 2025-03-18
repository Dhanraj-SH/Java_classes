import java.util.Scanner;

class P93{
    static  int Power(int x){
        int res=1;
        while(x>0){
            res=res*10;
            x--;
        }
        return res;
    }
    static int Count(int x){
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }
        return count;
    }
    static int Rotate(int x, int power) {
        int rem = x % 10;
        x = (rem * power) + (x / 10);
        return x;
    }


    static int Cyclic(int x) {
        int count = Count(x);
        int power = Power(count - 1);
        int y = x;
        int m = 1;

        while (m <= count) {
            int mul = y * m;
            int rotate = y;
            int count1 = 0;

            for (int i = 0; i < count; i++) {
                rotate = Rotate(rotate, power);
                if (rotate == mul) {
                    count1 = 1;
                    break;
                }
            }
            if (count1 == 0) {
                return 0; 
            }
            m++;
        }
        return 1; 
    }


    static void Digit(int x){
        if(Cyclic(x)==1){
            System.out.println(x+  " is a circular number");
        }
        else{
            System.out.println(x+" is not a circular number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}