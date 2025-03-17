import java.util.Scanner;

class P75{
    static void Find(int x){
        int count=0,count1=0;
        while(x>0){
            int rem= x%10;
            x/=10;
            if(rem%2==0){
                count++;
            }
            else{
                count1++;
            }
        }
    System.out.println(count +" Even "+count1+" Odd");
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