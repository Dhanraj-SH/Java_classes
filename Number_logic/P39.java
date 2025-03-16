import java.util.Scanner;

class P39{

    static int Magic(int x){
        int rem,answer=0;
        do {
            answer=0;
            while(x>0){
                rem= x%10;
                x=x/10;
                answer=answer+rem;
            }
            x=answer;
        }while(answer>9);
        if(answer==1){
            return 1;
        }
        return 0;
    }

    static void Digit(int x,int y){
        for (int i=x;i<=y;i++){
        int r= Magic(i);
         if(r==1){
            System.out.println(i);
        }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range from and to  :");
        int x = in.nextInt();
        int y = in.nextInt();
        Digit(x,y);
    }
}