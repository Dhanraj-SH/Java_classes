import java.util.Scanner;
class Area_of_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base and height");
        int base = sc.nextInt();
        int height = sc.nextInt();
        
        int area = (base * height ) / 2;

        System.out.println("Area of triangle = " +area );
        }
}