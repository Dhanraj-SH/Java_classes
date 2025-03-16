import java.util.Scanner;

class P45{

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
                int z=1;
        int a=1;
        while (z<=i) {
            if(a==i){
                System.out.println(i);
                break;
            } 
            a=z*(z+1);
            z++;
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