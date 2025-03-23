import java.util.Scanner;

class Fibnoccai_series{
    static void Fibonnic(int x){
        if (x<0){
            System.out.println("The give number is a invalid number");
        }
        else{
            int a = 0;
            int b = 1;
            System.out.println(+a +" " +b +" ");
            for (int i=0;i<x;i++){
                int next = a + b;
                System.out.println(next + " ");
                a=b;
                b=next;
            } 
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        Fibonnic(n);
}
}