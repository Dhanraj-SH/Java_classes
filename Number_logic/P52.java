import java.util.Scanner;

class P52{
    static int Fact(int x){
        int y=1;
        while(x>0){
            y=y*x;
            x--;
        }
        return y;
    }

    static void Digit(int x){
        int count=x,i=0;
        while(count>0){
            i++;
            int k=i,j=i;
            int r=0;
            while(k>0){
                int rem= k%10;
                k/=10;
                r=r+Fact(rem);
            }
            if(r==j){
                count--;
            }
        }
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}