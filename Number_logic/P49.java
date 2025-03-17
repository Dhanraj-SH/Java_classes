import java.util.Scanner;

class P49{
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

    static void Digit(int x){
        int count=x,i=1;
        while(count>0){
            i++;
            int z= Prime(i);
            if(z==0){
                count--;
            }
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}