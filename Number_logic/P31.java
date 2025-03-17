import java.util.Scanner;

class P31{

    static int Prime(int n){
        int count=0;
        for (int i =2; i*i<=n;i++) {
            if(n%i==0){
                count++;
                break;
            }
        }
        return count;
    }

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int z= Prime(i);
            if(z==0){
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