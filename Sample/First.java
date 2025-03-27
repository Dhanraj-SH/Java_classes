import java.util.Scanner;

class First{
    static int Power(int x){
        int res=1;
        while(x>0){
            res=res*10;
            x--;
        }
        return res;
    }

    static void Digit(int x){
        int y=0;
        int res=0;
        while(x>0){
            int rem=x%8;
            x=x/8;
            res=res+(Power(y)*rem);
            y++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = in.nextInt();
        Digit(x);
    }
}
/*class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
*/