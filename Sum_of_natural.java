import java.util.Scanner;

class Sum_of_natural{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = val.nextInt();
        int i ;
        int sum = 0;
        if(n>0){
            for ( i=1;i<=n;i++){
                sum = sum + i;
            }
        System.out.println("The sum of the natural numbers:"+ sum);
        }
        else{
            System.out.println("Enter the value greater than zero");
        }
    }

}