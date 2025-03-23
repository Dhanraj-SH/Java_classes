import java.util.Scanner;

class Lenght_bymethod{
    static void Lenght(int x){
        int count=0;
        while (x>0) { 
            x/=10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        Lenght(n);
    }
}