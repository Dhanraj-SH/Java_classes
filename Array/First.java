import java.util.Scanner;

class First{

    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of the array row and coloum size");
        int n=val.nextInt();
        int m=val.nextInt();
        int[] [] a=new int [n][m];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=val.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}