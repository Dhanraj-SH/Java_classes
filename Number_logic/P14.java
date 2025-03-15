import java.util.Scanner;

class P14{
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
        int y=x;
        int count= Count(y);
        int r=0;
        while(y>0){
            int rem= y%10;
            y/=10;
            r=r+Power(rem,count);
        }
        if(r==x){
            System.out.println(x+" is a Armstrong number");
        }
        else{
            System.out.println(x+" is not a Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}