import java.util.Scanner;

class P59{
    static int Multiply(int x){
        int res=1;
        while(x>0){
            int rem= x%10;
            x/=10;
            res=res*rem;
        }
        return res;
    }

    static int Sum(int x){
        int res=0;
        while(x>0){
            int rem= x%10;
            x/=10;
            res=res+rem;
        }
        return res;
    }
    
    static void Digit(int x){
        for (int i=1;i<=x;i++){
        int r=Sum(i);
        int s=Multiply(i);
        if(s==r){
            System.out.println(i);
        }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}