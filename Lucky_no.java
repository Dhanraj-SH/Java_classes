import java.util.Scanner;

class Lucky_no{

    static void Digit(int x){
        int rem,answer=0;
        do {
            answer=0;
            while(x>0){
            rem= x%10;
            x=x/10;
            answer=answer+rem;
            }
            x=answer;
        }while(answer>9);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        Digit(n);
    }
}