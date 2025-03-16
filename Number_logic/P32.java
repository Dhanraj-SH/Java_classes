import java.util.Scanner;

class P32{

    static int Power(int n){
        int x=0;
        for(int i=1;i<=n;i++){
            x = i*i;
        }
        return x;
    }

    static int Square(int n){
        int x=1,y=1,count=0;
        while(y<=n){
            if(y==n){
                count ++;
                break;
            }
            x++;
            y=Power(x);
        }
        return count;
    }


    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
            int z= Square(i);
            if(z==1){
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