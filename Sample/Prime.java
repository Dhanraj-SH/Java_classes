import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = val.nextInt();
        int i;
        for (i=2;i*i<=n;i++){
            if(n==1||n==2){
                break;
            }
            else if(n%i==0){
                System.out.println("The number "+ n + " not a prime number" );
                return ;
            }
        }
        System.out.println("The number "+ n +" is a prime number");
}
}