import java.util.Scanner;

class Sum_of_factorial{

    static void Digit(int x){
        int temp=0;
        while(x>0){
            int rem = x %10;
            x/=10;
            int sum =1;
            for (int i=1; i<=rem ;i++){
                sum=sum*i;
            }
            temp=temp+sum;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = in.nextInt();
        Digit(n);
    }
}