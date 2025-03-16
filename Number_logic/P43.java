import java.util.Scanner;

class P43{

    static int Square(int x){
        int res=x*x;
        return res;
    }



    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int z=i+1;
            int n=1;
            int a=Square(n);
            while (a<=z) { 
                if(a==z){
                    System.out.println(i);
                    break ;
                }
                n++;
                a=Square(n);
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