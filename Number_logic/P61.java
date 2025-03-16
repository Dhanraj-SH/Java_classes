import java.util.Scanner;

class P61{
    static int Square(int x){
        int res=x*x;
        return res;
    }



    static void Digit(int x){
        for (int i=1;i<=x;i++){
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
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}