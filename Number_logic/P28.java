import java.util.Scanner;

class P28{

    static int Cube(int x){
        int res=1;
        for(int i=0;i<3;i++){
            res=res*x;
        }
        return res;
    }

    static int Count(int x){
        int count=0;
        while (x>0) { 
            x/=10;
            count++;
        }
        return count;
    }

    static int Power(int x){
        int res=1;
        for(int i=0; i<x; i++){
            res=res*10;
        }
        return res;
    }

    static void Digit(int x){
        int y = Cube(x);

        int res=y%Power(Count(x));
        if(res == x){
            System.out.println(x+" is a Trimorpic number");
        }
        else{
            System.out.println(x+" is not a Trimorphic number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers  :");
        int x = in.nextInt();
        Digit(x);
    }
}