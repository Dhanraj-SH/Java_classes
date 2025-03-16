import java.util.Scanner;

class P29{

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
        int count= Count(x);
        if(count%2==0){
            System.out.println(x+" is a Evil number");
        }
        else{
            System.out.println(x+" is not a evil number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers  :");
        int x = in.nextInt();
        Digit(x);
    }
}