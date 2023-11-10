import java.util.*;
public class Kadnesalgo {

        public static void main(String[] args){

            int[] A = {-2,1,-3,4,-1,2,1,-5,4};
        int n = A.length;
        int currsum = A[0];
        int maxsum = A[0];
        for(int i =1;i<n;i++){
            if(currsum>=0){
                currsum = currsum+A[i];
            }else{
                currsum = A[i];
            }
            if(maxsum<currsum){
                maxsum = currsum;
            }
        }
        System.out.print(maxsum);

    }
}
