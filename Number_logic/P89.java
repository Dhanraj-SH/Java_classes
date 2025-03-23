import java.util.Scanner;

class P89{
    static int Duck(String x){
        if(x.charAt(0)=='0'){
            return 0;
        }
        else{
            int n= Integer.parseInt(x);
            while(n>0){
                if(n%10==0){
                    return 1;
                }
                n/=10;
            }
        }
        return 0;
    }
    static void Digit(String x){
        int f= Duck(x);
        if(f==1){
            System.out.println(x+" is a Duck number");
        }
        else{
            System.out.println(x+" is not a Duck number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n  :");
        String x = in.next();
        Digit(x);
    }
}