public class SortingZeroOneTwo {
    public static void main(String[]args){
        int[] A = {0,1,1,0,2,1,0,2,0,2};
        int i = 0;
        int j = 0;
        int k = A.length-1;
        while(i<k){
            if(A[i]==0){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
                i++;
            }
            else if(A[i]==1){
                i++;
            }else{
                int temp = A[i];
                A[i]=A[k];
                A[k]=temp;
                k--;
            }
        }
        for(int val :A){
            System.out.print(val);
        }


    }
}
