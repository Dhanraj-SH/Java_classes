import java.util.Scanner;

class P20{
    static void Digit(int x){
        int rem,answer=0;
        int y=x;
        do {
            answer=0;
            while(x>0){
            rem= x%10;
            x=x/10;
            answer=answer+rem;
            }
            x=answer;
        }while(answer>9);
        if(answer==1){
            System.out.println(y+" is a Magic number");
        }
        else{
            System.out.println(y+" is not a magic number");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}