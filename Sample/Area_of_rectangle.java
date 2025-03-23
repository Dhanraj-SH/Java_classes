import java.util.Scanner;
class Area_of_rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of height and width");
        int height = sc.nextInt();
        int width = sc.nextInt();
        
        int area = height * width;

        System.out.println("Area of Rectangle = " +area );
        }
}