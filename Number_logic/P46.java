import java.util.Scanner;

class P46{
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

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int z = Cube(i);
            int res=z%Power(Count(i));
            if(res == i){
                System.out.println(i);
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