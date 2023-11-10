import java.util.*;
//import java.util.Scanner;



public class SmallestNumber {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       System.out.print(solution(num));
    }
   public static int solution(int num) {

       String ans = "";
       for (int div = 9; div >= 2; div--) {
           while (num % div == 0) {
               num = num / div;
               ans = div + ans;
           }
       }
       if (num != 1) {
           //System.out.print(-1);
           return -1;
       } else {
         //  System.out.print(Integer.parseInt(ans));
           return Integer.parseInt(ans);

       }
   }
}
