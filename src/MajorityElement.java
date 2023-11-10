public class MajorityElement {
    public static void main(String [] args){
        int[]A={5,7,4,7,4,4,5,4,4,7,4,4};
        int candidate = A[0];
        int count =1;
        for(int i =1;i<A.length;i++){
            if(candidate == A[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate = A[i];
                count = 1;
            }
        }
        int count2 = 0;
        for(int var : A){
            if(var == candidate){
                count2++;
            }
        }
        if(count2>A.length/2) {
            System.out.print(candidate);
        }else{
            System.out.print(-1);
        }

    }
}
