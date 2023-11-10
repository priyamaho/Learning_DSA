public class InversionCount {
    public static void main(String[] args){
        //if A[i] > A[j] then all pairs with A[i]
        // called inversions like below. and i<j;
        int[] arr = {8,5,3,4,1,6,2};
        int low = 0;
        int high = arr.length;
        merge_sort(arr,low,high);

    }
    public static int merge_sort(int[]arr,int low,int high){
        int mid = (low+high)/2;
        int[] A= new int[]{merge_sort(arr,low,mid)};
        int[] B = new int[]{merge_sort(arr, mid + 1, high)};
        int C = inversionCount(A,B);
        return C;
    }
    public static int inversionCount(int[] A,int[] B){
        int count = 0;
        int[]ans = new int[A.length+B.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<A.length && j<B.length){
            if(A[i]>B[j]){
                ans[k]=B[j];
                count++;
                j++;

            }else{
                ans[k]=A[i];
                i++;
            }
            k++;
        }
        return count;
    }
}
