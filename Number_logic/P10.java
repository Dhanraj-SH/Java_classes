import java.util.Scanner;

class P10{
    static int Prime(int n){
        for (int i =2; i*i<=n;i++) {
            if(n%i==0){
                return Prime(n+1);
            }
        }
        return n;
    }
    static void Fact(int a){
        int n=2;
        if(a<2){
            System.out.println("Give valid input ");
        }
        while(a>=2) {
            if(a%n==0) {
              a=a/n;
              System.out.print(n +","); 
            }
            else{
                n=Prime(n+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Fact(x);
    }
}