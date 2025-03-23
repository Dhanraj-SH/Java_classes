import java.util.Scanner;
class Area_of_square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int side = sc.nextInt();
        
        int area = side*side;

        System.out.println("Area of square = " +area );
        }
}