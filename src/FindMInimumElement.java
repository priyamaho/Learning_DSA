public class FindMInimumElement {
    public static void main(String[]args){
        //used binary search TCO(log2n) SCO(1);
        int []A= {9,11,14,15,20,22,25,1,3,5,7};
        int n =A.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int mid = (left+right)/2;
            if(A[mid]<A[right]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        System.out.print(A[right]);
    }
}
