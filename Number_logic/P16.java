import java.util.Scanner;

class P16{
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
        int r=Prefect(x);
        
        if(r==x){
            System.out.println(x+" is a Perfect number");
        }
        else{
            System.out.println(x+" is not a Perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}