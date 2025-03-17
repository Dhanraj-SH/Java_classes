import java.util.Scanner;

class P77{
    static int Prefect(int x){
        int y=1,res=0;
        while(y<x){
            if(x%y==0){
                res= res+y;
            }
            y++;
        }
        return res;
    }

    static int Abundant(int x){
        int y=1,res=0;
        while(y<x){
            if(x%y==0){
                res= res+y;
            }
            y++;
        }
        return res;
    }
    
    static void Digit(int x){
        int count=0,count1=0,count2=0;
        for(int i=1;i<=x;i++){
            int p=Prefect(i);
            int q=Abundant(i);
            int r=q;
            if(p==i){
                count++;
            }
            else if(q>i){
                count1++;
            }
            else if(r<i*2){
                count2++;
            }
        }
        System.out.println("Deficient number:"+count2+" Perfect number:"+count+" Adundant number:"+count1 );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}