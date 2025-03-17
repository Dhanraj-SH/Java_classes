import java.util.Scanner;

class P76{
        static int Prime(int n){
        for (int i =2; i*i<=n;i++) {
            if(n%i==0){
                return Prime(n+1);
            }
        }
        return n;
    }
    static void Fact(int a){
        int b=a;
        int count=0;
        int n=2;
        if(a<1){
            System.out.println("Give valid input ");
        }
        else if(a==1){
            System.out.println(a);
        }
        while(a>=2) {
            if(n<=5){
                if(a%n==0) {
                    a=a/n;
                    count=1; 
                }
                else{
                    n=Prime(n+1);
                }
            }
            else{
                count=0;
                break;
            }
        }
        if(count==1){
            System.out.println(b+" is a ugly number ");
        }
        else{
            System.out.println(b+" is not a ugly number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Fact(x);
    }
}
