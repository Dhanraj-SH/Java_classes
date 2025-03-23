import java.util.Scanner;

class Clear_bit{

    static void Digit(int x , int i){
        System.out.println(x&(~(1<<i)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and its ith bit to be checked  :");
        int x = in.nextInt();
        int i = in.nextInt();
        Digit(x,i);
    }
}