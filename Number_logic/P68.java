import java.util.Scanner;

class P68{
    static void Digit(int x){
        int zero=0,one=0;
        while(x>0){
                int rem=x%10;
                if(rem==0||rem==1){
                    x/=10;
                    if(rem==0){
                        zero++;
                    }
                    else{
                        one++;
                    }
                }
                else{
                    System.out.println("Give valid number");
                    return;
                }
        }
        System.out.println(one+ " 1s "+zero+" 0s ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}