import java.util.Scanner;

class P4{
    static void Count(int x){
        int count=0;
        while(x>0){
            x=x/10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number x :");
        int x = in.nextInt();
        Count(x);
    }
}