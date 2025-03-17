import java.util.Scanner;

class P57{
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

    static void Digit(int x){
        int count=x,i=0;
        while(count>0){
        i++;
        int r= Magic(i);
         if(r==1){
            count--;
        }
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth range  :");
        int x = in.nextInt();
        Digit(x);
    }
}