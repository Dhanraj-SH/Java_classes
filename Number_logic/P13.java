import java.util.Scanner;

class P13{
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


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        int y = Square(x);
        if (y>0) {
            System.out.println(x+" is a perfect square");
        }
        else{
            System.out.println(x+" is not a perfect square");
        }
    }
}