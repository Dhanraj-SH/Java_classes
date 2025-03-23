import java.util.Scanner;

class Fibnoccai_num{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        if (n==0||n==1){
            System.out.println("The "+ n + " is a fibonnic number");
        }
        int flag = 0;
        int a = 0;
        int b = 1;
        for (int i=1;i<n;i++){
            int next = a+b;
            if (next == n){
                flag ++;
                break ;
            }
            a=b;
            b=next;
        }
        if (flag == 1){
            System.out.println("The "+ n + " is a fibnoccai number");
        }
        else{
            System.out.println("The "+ n + " is not a fibnoccai number");
        }
    }
}