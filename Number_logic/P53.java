import java.util.Scanner;

class P53{
    static int Prefect(int x){
        int y=1,res=0;
        while(y<x){
            if(x%y==0){
                res= res+y;
            }
            y++;
        }
        return res;
    }

    static void Digit(int x){
        for (int i=1;i<=x;i++){
            int r=Prefect(i);
            if(r==i){
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