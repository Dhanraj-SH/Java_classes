import java.util.Scanner;

class P55{
static int Abundant(int x){
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
        int count=x,i=0;
        while(count>0){
            i++;
            int r= Abundant(i);
            if(r>i){
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