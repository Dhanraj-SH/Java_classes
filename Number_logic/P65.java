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
        int flag=x,i=0;
        while(flag<0){
            i++;
            int count= Count(i);
            if(count%2==0){
                flag--;
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