import java.util.Scanner;

class P102{
    static int Power(int x, int y, int temp){
        if(y>0){
            x=x*temp;
            y--;
            return Power(x, y, temp);
        }
        return x;
    }
    static void Digit(int x ,int y){
        if(y>0){
            System.out.println(Power(x, y, x));
        }
        else{
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}