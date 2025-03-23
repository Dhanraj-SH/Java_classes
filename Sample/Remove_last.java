import java.util.Scanner;

class Remove_last
{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n = val.nextInt();
        System.out.println("Enter the 2nd number");
        int m = val.nextInt();
        int rem ;
        int l=0;
        int k=m;
        while(m>0){
            m=m/10;
            l++;
        }
        for(int i=1;i<=l;i++){
            n = n /10;
        }
        while(k>0){
            rem = k % 10;
            k = k / 10;
            n=(n*10)+rem;
        }
        System.out.println("The last digit of the  number "+ n);
    }
}