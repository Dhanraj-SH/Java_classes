import java.util.Scanner;

class Greatest_of_two{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the two values to check greatest :");
        int n = val.nextInt();
        int m = val.nextInt();

        if (n>m){
            System.out.println("The value "+ n +" greater than " + m);
        }
        else {
            System.out.println("The value "+ m +" greater than " + n);
        }

    }

}