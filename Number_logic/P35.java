import java.util.Scanner;

class P35{

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

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int r=Prefect(i);
            if(r==i){
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