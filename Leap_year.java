import java.util.Scanner;

class Leap_year{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = val.nextInt();
        if(year%400==0){
            System.out.println("The "+ year +" is a leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("The "+ year +" is not a leap year");
        }
        else{
            System.out.println("The "+ year +" is not a leap year");
        }

    }
}