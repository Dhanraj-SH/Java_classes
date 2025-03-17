import java.util.Scanner;

class P63{
    static void Digit(int x){
        int count=x,i=0;
        while(count>0){
            i++;
            int z=1;
            int a=1;
            while (z<=i) {
                if(a==i){
                    count--;
                    break;
                } 
                a=z*(z+1);
                z++;
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