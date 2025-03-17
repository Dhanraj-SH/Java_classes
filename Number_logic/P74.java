import java.util.Scanner;

class P74{
    static void Find(int x){
        int temp=9,temp1=9;
        while(x>0){
            int rem= x%10;
            x/=10;
            if(rem<temp){
                temp1=temp;
                temp = rem;
            }
            else if (rem < temp1 && rem != temp) {  
                temp1 = rem;
            }
        }
        if (temp1 == 9) {
            System.out.println(  temp + ", No second smallest digit");
        } else {
            System.out.println( + temp + "," + temp1);
        }
        }
    static void Digit(int x){
        Find(x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}