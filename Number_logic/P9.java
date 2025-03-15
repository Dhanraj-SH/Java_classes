import java.util.Scanner;

class P9{
    static int Fact(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*Fact(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        System.out.println(Fact(x));
    }
}