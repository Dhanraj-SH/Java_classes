import java.util.Scanner;

class P34{

    static int Fact(int x){
        int y=1;
        while(x>0){
            y=y*x;
            x--;
        }
        return y;
    }

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int k=i,j=i;
            int r=0;
            while(k>0){
                int rem= k%10;
                k/=10;
                r=r+Fact(rem);
            }
            if(r==j){
                System.out.println(r);
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