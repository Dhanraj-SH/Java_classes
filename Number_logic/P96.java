import java.util.Scanner;

class P96 {
    static int Power(int x) {
        int res=1;
        for(int i=0;i<x;i++){
            res=res*2;
        }
        return res;
    }

    static int Prime(int x){
        for(int i=2; i*i<=x; i++){
            if(x%i==0){
                return 0;
            }
        }
        return 1;
    }
    static int Mersenne(int x){
        return Power(x)-1;
    }

    static void Digit(int x) {
        int i=2; 
        while (x>0) {    
            int z= Mersenne(i);
            int y=Prime(z);
                if(y==1){
                    System.out.println(z);
                    x--; 
            }
            i++;  
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range:");
        int x = in.nextInt();
        Digit(x);
    }
}
