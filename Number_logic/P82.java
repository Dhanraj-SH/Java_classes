import java.util.Scanner;

class P82{

    static int Power(int x, int y){
        int result=1;
        for(int i=0;i<y;i++){
             result*= x;
        }
        return result;
    }

    static int Count(int x){
        int count=0;
        while (x>0) { 
            x/=10;
            count++;
        }
        return count;
    }

    static void Digit(int x){
        int i=0;
        while(x>0){
            int k=i,j=i;
            int count= Count(i);
            int r=0;
            while(k>0){
                int rem= k%10;
                k/=10;
                r=r+Power(rem,count);
            }
            if(r==j){
                System.out.println(r);
                x--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the end range  :");
        int x = in.nextInt();
        Digit(x);
    }
}