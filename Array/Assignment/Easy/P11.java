import java.util.HashSet;
import java.util.Scanner;

class P11{

    static void Remove(int [] a){
        HashSet <Integer> r = new HashSet<>();
        for(int i:a){
            r.add(i);
        }
        for(int i:r){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=val.nextInt();
        int [] a=new int [n];
        System.out.println("Enter the values of the array A");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        Remove(a);
    }
}