import java.util.Scanner;

class P86{
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
    static int Power(int x,int y){
        int res=1;
        for(int i=0;i<y;i++){
            res=res*x;
        }
        return res;
    }
    static int Disarium(int x){
        int count=0,res=0;
        int y=x;
        while (y > 0) {
            y /= 10;
            count++;
        }

        y = x; 
        while (y > 0) {
            int rem = y % 10;
            y /= 10;
            res += Power(rem, count);
            count--;
        }
        return (res==x)?1:0;
    }
    static int Unhappy(int x){
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
        int h=Unhappy(x);
        int d=Disarium(x);
        if(h==0&&d==1){
            System.out.println(x+" is both Disarium and Unhappy number");
        }
        else if(h==0&&d==0){
            System.out.println(x+" is  Unhappy number");
        }
        else if(d==1&&h==1){
            System.out.println(x+" is  Disarium number");
        }
        else{
            System.out.println(x+" is either Disarium nor Unhappy number");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n  :");
        int x = in.nextInt();
        Digit(x);
    }
}