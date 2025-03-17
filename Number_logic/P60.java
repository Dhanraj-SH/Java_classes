import java.util.Scanner;

class P60{
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


    static void Digit(int x){
        int count=x,i=0;
        while(count>0){
            i++;
            int r=Sum(i);
            while(r != 1 && r != 4) { 
                r = Sum(r);
            }   
            if(r == 1){ 
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