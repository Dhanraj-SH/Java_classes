import java.util.Scanner;

class P19{
    static int Count(int x){
        int count=0;
        while (x>0) { 
            x/=10;
            count++;
        }
        return count;
    }

    static int Reverse(int x){
        int res=0;
        while (x>0) { 
            int rem=x%10;
            x/=10;
            res=res*10+rem;
        }
        return res;
    }
    
    static int Automorphic(int x){
        int y=x*x;
        int count=Count(x);
        int res=0;
        while (count>0) { 
            int rem = y%10;
            y/=10;
            res=res*10+rem;
            count --;
        }
        return Reverse(res);
    }
    static void Digit(int x){
        int r=Automorphic(x);
        
        if(r==x){
            System.out.println(x+" is a Automorphic number");
        }
        else{
            System.out.println(x+" is not a Automorphic number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}