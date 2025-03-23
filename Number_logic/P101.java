import java.util.Scanner;

class P101{
    static void Digit(int x ,int y){
        System.out.println("Before Swap "+x+" " +y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swap "+x+" "+y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}