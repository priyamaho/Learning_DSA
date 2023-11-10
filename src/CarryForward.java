public class CarryForward {
    public static void main(String[]args){
        int[] arr = {2,3,4,5,7,3,7,0};
        System.out.print(solution(arr));

    }
    public static int solution(int[]A){
        int n=A.length;
        int max = Integer.MIN_VALUE;
        for(int s =0;s<n;s++){
            int sum = 0;
            for(int e =s;e<n;e++){
                sum = sum+A[e];
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}
