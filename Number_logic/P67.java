import java.util.Scanner;

class P67{
    static int Generic(int x){
        int answer;
        do { 
            int res=0;
            while (x>0) {
                int rem=x%10;
                x/=10; 
                res=res+rem;
            }
            x=res;
            answer=res;
        } while (answer>9);
        return answer;
    }

    static void Digit(int x){
        System.out.println(Generic(x));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}