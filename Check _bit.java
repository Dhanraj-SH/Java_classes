import java.util.Scanner;

class Check_bit{

    static void Digit(int x , int i){
        int y=1<<i;
        if((x&y)==0){
            System.out.println("Unset");
        }
        else{
             System.out.println("Set");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and its ith bit to be checked  :");
        int x = in.nextInt();
        int i = in.nextInt();
        Digit(x,i);
    }
}