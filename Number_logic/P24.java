import java.util.Scanner;

class P24{

    static int Square(int x){
        int res=x*x;
        return res;
    }

    static int Sum(int x){
        int res=0;
        while(x>0){
            int rem= x%10;
            x/=10;
            res=res+Square(rem);
        }
        return res;
    }
    static void Digit(int x){
        int y=Sum(x);
        int count=0;
        while(x!=y) {
            if(y==1){
                count++;
                break;
            }
            else{
                y=Sum(y);
            }
        }
        if(count>0){
            System.out.println(x+" is a happy number");
        }
        else{
            System.out.println(x+" is not a happy number");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers  :");
        int x = in.nextInt();
        Digit(x);
    }
}