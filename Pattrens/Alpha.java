
import java.util.Scanner;

class First{

    static void PrintA(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||j==0||j==x-1||i==x/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }      
    static void PrintB(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||j==0||j==x-1||i==x-1||i==x/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintC(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||j==0||i==x-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    } 
    static void PrintD(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||(i==0&&j<3*(x/4))||(i==x-1&&j<3*(x/4))||(j==x-1&&i>x/4&&i<3*(x/4))||i-j==-3*(x/4)||i+j==7*(x/4)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }  
    static void PrintE(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i==0||i==x-1||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    } 
    static void PrintF(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i==0||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    } 
    static void PrintG(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i==0||i==x-1||(j==x-1&&i>(x/2))||(i==x/2&&j>x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    } 
    static void PrintH(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||j==x-1||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintI(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||i==x-1||j==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintJ(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||(i==x-1&&j<x/2)||j==x/2||(j==0&&i>3*(x/4))){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintK(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i+j==(x/2)||(i==x/2&&j<=x/2)||(j==x/2&&i>x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintL(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintM(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||j==x-1||(i<=x/2&&i-j==0)||(i<x/2&&i+j==x-1)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }  
    static void PrintN(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||j==x-1||i-j==0){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }  
    static void PrintO(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if((j==0&&i>x/4&&i<3*(x/4))||(j==x-1&&i>x/4&&i<3*(x/4))||(i==0&&j>x/4&&j<3*(x/4))||(i==x-1&&j>x/4&&j<3*(x/4))||i-j==3*(-x/4)||i-j==3*(x/4)||i+j==x/4||i+j==7*(x/4)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintP(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i==0||(j==x-1&&i<x/2)||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }    
    static void PrintQ(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if((j==0&&i<3*(x/4))||(i==0&&j<3*(x/4))||(i==3*(x/4)&&j<3*(x/4))||(j==3*(x/4)&&i<3*(x/4))||i-j==0){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintR(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||i==0||(j==x-1&&i<x/2)||i==x/2||(i-j==0&&i>x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintS(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||i==x-1||i==x/2||(j==0&&i<x/2)||(j==x-1&&i>x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintT(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==x/2||i==0){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintU(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if((j==0&&i<3*(x/4))||(j==x-1&&i<3*(x/4))||(i==x-1&&j>x/4&&j<3*(x/4))||i-j==3*(x/4)||i+j==7*(x/4)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintV(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if((j==0&&i<x/2)||(j==x-1&&i<x/2)||i-j==x/2||i+j==3*(x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintW(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==0||j==x-1||(i+j==x-1&&i>x/2)||(i-j==0&&i>=x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintX(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i-j==0||i+j==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintY(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if((i-j==0&&i<x/2)||(i+j==x-1&&i<x/2)||(j==x/2&&i>=x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintZ(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||i==x-1||i+j==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintSpace(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print1(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x-1||j==x/2||(i+j==x/2&&i<=x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print2(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x-1||i==0||i==x/2||(j==0&&i>x/2)||(j==x-1&&i<x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print3(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x-1||i==0||i==x/2||j==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print4(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j==x-1||(j==0&&i<x/2)||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print5(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x-1||i==0||i==x/2||(j==0&&i<x/2)||(j==x-1&&i>x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print6(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x-1||i==0||i==x/2||j==0||(j==x-1&&i>x/2)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print7(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||i+j==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print8(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||j==0||j==x-1||i==x-1||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print9(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||(j==0&&i<x/2)||j==x-1||i==x-1||i==x/2){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Print0(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||j==0||j==x-1||i==x-1||i+j==x-1){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void PrintMinus(char a){
        int x=9;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==x/2&&j>=x/4&&j<=3*(x/4)){
                    System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main (String [] args){
        Scanner val = new Scanner(System.in);
        String c=val.nextLine();
        for(int i=0;i<c.length();i++){
            char n=c.charAt(i);
            switch (n) {
                case 'A':
                case 'a':
                    PrintA(n);
                    break;
                case 'B':
                case 'b':
                    PrintB(n);
                    break;
                case 'C':
                case 'c':
                    PrintC(n);
                    break;
                case 'D':
                case 'd':
                    PrintD(n);
                    break;
                case 'E':
                case 'e':
                    PrintE(n);
                    break;
                case 'F':
                case 'f':
                    PrintF(n);
                    break;
                case 'G':
                case 'g':
                    PrintG(n);
                    break;
                case 'H':
                case 'h':
                    PrintH(n);
                    break;
                case 'I':
                case 'i':
                    PrintI(n);
                    break;
                case 'J':
                case 'j':
                    PrintJ(n);
                    break;
                case 'K':
                case 'k':
                    PrintK(n);
                    break;
                case 'L':
                case 'l':
                    PrintL(n);
                    break;
                case 'M':
                case 'm':
                    PrintM(n);
                    break;
                case 'N':
                case 'n':
                    PrintN(n);
                    break;
                case 'O':
                case 'o':
                    PrintO(n);
                    break;
                case 'P':
                case 'p':
                    PrintP(n);
                    break;
                case 'Q':
                case 'q':
                    PrintQ(n);
                    break;
                case 'R':
                case 'r':
                    PrintR(n);
                    break;
                case 'S':
                case 's':
                    PrintS(n);
                    break;
                case 'T':
                case 't':
                    PrintT(n);
                    break;
                case 'U':
                case 'u':
                    PrintU(n);
                    break;
                case 'V':
                case 'v':
                    PrintV(n);
                    break;
                case 'W':
                case 'w':
                    PrintW(n);
                    break;
                case 'X':
                case 'x':
                    PrintX(n);
                    break;
                case 'Y':
                case 'y':
                    PrintY(n);
                    break;
                case 'Z':
                case 'z':
                    PrintZ(n);
                    break;
                case ' ':
                    PrintSpace(n);
                    break;
                case '1':
                    Print1(n);
                    break;
                case '2':
                    Print2(n);
                    break;
                case '3':
                    Print3(n);
                    break;
                case '4':
                    Print4(n);
                    break;
                case '5':
                    Print5(n);
                    break;
                case '6':
                    Print6(n);
                    break;
                case '7':
                    Print7(n);
                    break;
                case '8':
                    Print8(n);
                    break;
                case '9':
                    Print9(n);
                    break;
                case '0':
                    Print0(n);
                    break;
                case '-':
                    PrintMinus(n);
                    break;
                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }
    } 
}
