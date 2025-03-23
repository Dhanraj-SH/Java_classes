import java.util.Scanner;

public class Test {
    // static int Power(int n,int temp){
    //     int res=1;
    //     for(int i=0;i<n;i++){
    //         res=res*temp;
    //     }
    //     return res;
    // }
    // static int Count (int n){
    //     int count=0;
    //     while(n>0){
    //             n=n/10;
    //         count++;
    //         }
    //     return count;
    // }
    // static void Digit(int n){
    //     int x=0;
    //     int count=0;
    //     while(count<n){
    //         int power=Power(n,x);
    //         count=Count(power);
    //         if(count==n){
    //             System.out.println(power);
    //         }
    //         x++;
    //     }
    // }
    
    // public static void main(String[] args) {
    //     Scanner val = new Scanner(System.in);
    //     int n=val.nextInt();
    //     Digit(n);
    // }



    //    static long Power(long temp,int n){
    //     long res=1;
    //     for(int i=0;i<n;i++){
    //         res=res*temp;
    //     }
    //     return res;
    // }
    // static int Count(long n){
    //     int count=0;
    //     while(n>0){
    //         n/=10;
    //         count++; 
    //     }
    //     return count;
    // }
    // static void Digit(int n){
    //     long answer=0;
    //     long start=Power(10,n-1);
    //     long end=start*10;
        
    //     for(long x=start;x<end;x++){
    //         long res=0;
    //         long duplicate=x;
    //         int count=Count(x);
            
    //         while(duplicate>0){
    //             long rem=duplicate%10;
    //             duplicate/=10;
    //             res=res+Power(rem,count);
    //         }
            
    //         if(res==x){
    //             answer=answer+x;
    //         }
    //     }
        
    //     System.out.println(answer);
    // }
    // public static void main(String[] args) {
    //     Scanner val = new Scanner(System.in);
    //     int n=val.nextInt();
    //     Digit(n);    
    // }
    static int Power(int n){
        int res=1;
        for(int i=0;i<n;i++){
            res=res*n;
        }
        return res;
    }
    static void Digit(int n){
        int res=0;
        for(int i=1;i>=n;i++){
            res=res+Power(i);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int n=val.nextInt();
        Digit(n);
    }
}


