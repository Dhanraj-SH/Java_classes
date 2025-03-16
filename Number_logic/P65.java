import java.util.Scanner;

class P65{
    static  int Count( int x){
        int count =0;
        while (x>0) { 
            if(x%2==1){
                count++;
            }
            x/=2;
        }
        return count;
    }

    static void Digit(int x){
        for (int i=1;i<=x;i++){
            int count= Count(i);
            if(count%2==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}