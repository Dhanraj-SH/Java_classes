import java.util.Scanner;

class P12{
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


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        if (x<2) {
            System.out.println("Give a vaild input");
        }
        else{
            int y=Prime(x);
            if(y>0){
                System.out.println(x+" is a not prime number");
            }
            else{
                System.out.println(x+" is a prime number");
            }
        }
    }
}