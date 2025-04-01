import java.util.Scanner;
import java.util.Stack;

class Array_to_stack{

    static void Array(int [] a){
        Stack <Integer> s = new Stack<>();
        for(int i=0;i<a.length;i++){
            s.push(a[i]);
        }
        System.out.println(" "+s.peek());
        for(int i=0;i<a.length;i++){
            System.out.println(s.pop()+" ");
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
        Array(a);
    }
}