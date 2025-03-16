import java.util.Scanner;

class P41{

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
    
    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
        int r=Sum(i);
        int s=Multiply(i);
        if(s==r){
            System.out.println(i);
        }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range from and to  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}