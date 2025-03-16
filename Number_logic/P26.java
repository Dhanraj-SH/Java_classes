import java.util.Scanner;

class P26{

    static  int Reverse(int x){
        int res=0;
        while(x>0){
            int rem=x%10;
            x/=10;
            res=res*10+rem;
        }
        return res;
    }
    static int Square(int x,int y){
        int res=1;
        for(int i=0;i<y;i++){
            res=res*x;
        }
        return res;
    }

    static void Digit(int x){
        int count=0,res=0;
        int y=Reverse(x);
        while(y>0){
            int rem=y%10;
            y/=10;
            count++;
            res=res+Square(rem, count);
        }
        if(x==res){
            System.out.println(x+" is a Disarium number");
        }
        else{
            System.out.println(x+" is not a Disarium number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers  :");
        int x = in.nextInt();
        Digit(x);
    }
}