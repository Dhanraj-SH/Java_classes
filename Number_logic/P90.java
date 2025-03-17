import java.util.Scanner;

class P90{
static int Friendly(int x){
        int y=1,res=0;
        while(y<x){
            if(x%y==0){
                res= res+y;
            }
            y++;
        }
        return res;
    }
    static void Digit(int x, int y){
        int r=Friendly(x);
        int s=Friendly(y);
        if(x==s&&y==r){
            System.out.println(x+", "+y+" is a Amicable pair");
        }
        else{
            System.out.println(x+", "+y+" is not a Amicable pair");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}