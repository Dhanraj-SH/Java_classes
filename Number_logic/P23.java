import java.util.Scanner;

class P23{

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
    static void Spy(int x){
        int y=Sum(x);
        int z=Multiply(x);
        if(z==y){
            System.out.println(x+" is a Spy number");
        }
        else{
           System.out.println(x+" is not a Spy number"); 
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers  :");
        int x = in.nextInt();
        Spy(x);
    }
}