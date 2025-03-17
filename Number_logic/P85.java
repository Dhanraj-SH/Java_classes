import java.util.Scanner;

class P85{
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
    static int Happy(int x){
        int r=Sum(x);
        while(r != 1 && r != 4) { 
            r = Sum(r);
        }   
        if(r == 1){ 
            return 1;
        }
        return 0;
    }

    static void Digit(int x){
        int count=Happy(x);
        if(count==1){
            System.out.println(x+" is a Happy number");
        }
        else{
            System.out.println(x+" is a Unhappy number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n  :");
        int x = in.nextInt();
        Digit(x);
    }
}