
import java.util.Scanner;

class First{
    static int i;
    static void Sequence (int n,int m){
        if(n<m){
            System.out.print(n+" ");
            Sequence(n+1, m);
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        int n= val.nextInt();
        Sequence(i,n);
    }
}