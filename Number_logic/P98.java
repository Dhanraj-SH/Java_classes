import java.util.Scanner;

class P98{

    static void Pell(int x){
        int a=0;
        int b=1;
        int p;
        System.out.println(a);
        System.out.println(b);
        while(x>1){
            p=(2*b)+a;
            System.out.println(p);
            a=b;
            b=p;
            x--;
        }
    }
    static void Digit(int x){

        if(x==0){
            System.out.println(x);
        }
        else if(x==1){
            System.out.println(x-1);
            System.out.println(x);
        }
        else{
            Pell(x);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the end range  :");
        int x = in.nextInt();
        Digit(x);
    }
}