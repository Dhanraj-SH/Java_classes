import java.util.Scanner;

class P73{
    static void Find(int x){
        int temp=0,temp1=0;
        while(x>0){
            int rem= x%10;
            x/=10;
            if(rem>temp){
                temp1=temp;
                temp = rem;
            }
            else if (rem > temp1 && rem != temp) {  
                temp1 = rem;
            }
        }
        if (temp1 == 0) {
            System.out.println(  temp + ", No second largest digit");
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