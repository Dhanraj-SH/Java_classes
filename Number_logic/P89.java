import java.util.Scanner;

class P89{
    static int Duck(int x){
        int flag=0;
        while(x>0){
            if(x%10==0){
                flag=1;
            }
            x/=10;
        }
        return flag;
    }
    static void Digit(int x){
        int f= Duck(x);
        if(f==1){
            System.out.println(x+" is a Duck number");
        }
        else{
            System.out.println(x+" is not a Duck number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n  :");
        int x = in.nextInt();
        Digit(x);
    }
}