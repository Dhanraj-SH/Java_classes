
import java.util.HashMap;
import java.util.Scanner;

class First{

    static void Count(int [] a){
        HashMap <Integer,Integer> count= new HashMap<>();
        for(int i:a){
            if(!count.containsKey(i)) count.put(i,0);
            count.put(i,count.get(i)+1);
        }
        System.out.println(count);        
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=val.nextInt();
        int [] a=new int [n];
        System.out.println("Enter the values of the array");
        for(int i=0;i<n;i++){
            a[i]=val.nextInt();
        }
        Count(a);
    }
}