import java.util.Scanner;

class P17{
    static int Sum(int x){
        int res=0;
        while(x>0){
            int rem = x%10;
            x=x/10;
            res=res+rem;
        }
        return res;
    }
    static void Digit(int x){
        int y= Sum(x);
        if(x%y==0){
            System.out.println(x+" is Harshad number");
        }
        else{
            System.out.println(x+" is not a Harshad number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}