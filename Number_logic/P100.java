import java.util.Scanner;

class P100{
    static int Prime(int n){
        for (int i =2; i*i<=n;i++) {
            if(n%i==0){
                return Prime(n+1);
            }
        }
        return n;
    }
    static int Fact(int a){
        int n=2;
        while(a>=2) {
            if(a%n==0) {
              a=a/n; 
            }
            else{
                n=Prime(n+1);
                if(n>5){
                    return 0;
                }
            }
        }
        return 1;
    }
    static void Digit(int x){
        int y=x;
        int i=2;
        if(x==1){
            System.out.println(x);
        }
        else if(x>1){
            System.out.println("1");
            while(y>1){
                if(Fact(i)==1){
                    System.out.println(i);
                    y--;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}