import java.util.Scanner;

class Greatest_of_three{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the three values to check greatest :");
        int n = val.nextInt();
        int m = val.nextInt();
        int o = val.nextInt();

        if (n>m && n>o){
            System.out.println("The value "+ n +" is greater " );
        }
        else if(m>n && m>o) {
            System.out.println("The value "+ m +" is greater " );
        }
        else {
            System.out.println("The value "+ o +" is greater " );
        }
    }
}