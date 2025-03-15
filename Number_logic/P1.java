import java.util.Scanner;

class P1{

    static void Digit(int x){
        int answer=0;
        for(int i=1;i<=x;i++){
            answer=answer+i;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        Digit(n);
    }
}