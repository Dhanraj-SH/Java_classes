import java.util.Scanner;

class P62{
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
        for (int i=1;i<=x;i++){
            int count=0,res=0;
            int z=Reverse(i);
            while(z>0){
                int rem=z%10;
                z/=10;
                count++;
                res=res+Square(rem, count);
            }
            if(i==res){
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