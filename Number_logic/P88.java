import java.util.Scanner;

class P88{


    static void Digit(int x){
        int y=1;
        int z=1;
        while (y<=x) {
            if(z==x){
                System.out.println(x+" is a pronic number");
                return ;
            } 
            z=y*(y+1);
            y++;
        }
        System.out.println(x+" is not a pronic number");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers  :");
        int x = in.nextInt();
        Digit(x);
    }
}