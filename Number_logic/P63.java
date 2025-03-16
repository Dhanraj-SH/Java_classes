import java.util.Scanner;

class P63{
    static void Digit(int x){
        for (int i=1;i<=x;i++){
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
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}