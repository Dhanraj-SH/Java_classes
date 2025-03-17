import java.util.Scanner;

class P92{
    static int Cube(int x){
        return x*x*x;
    }

    static void Digit(int x){
        int y=1;
        int answer;
        do{
            answer=Cube(y);
            if(answer==x){
                System.out.println(x+" is a Cube");
                return;
            }
            y++;
        }while(answer<x);
        System.out.println(x+" is not a Cube");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}