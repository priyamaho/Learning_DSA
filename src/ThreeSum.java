import java.util.Arrays;

public class ThreeSum {
    public static void main(String[]args){
        int A[]={-1,-1,1,2,2,2,4,6,4,3,3};
        int n = A.length;
        int target = 6;
        Arrays.sort(A);
        for(int i =0;i<n;i++){
            if(i==0||A[i]!=A[i-1]){
                int j = i+1;
                int k = n-1;
                int tar = target - A[i];
                while(j<k){
                    if(A[j]+A[k]==tar){
                        System.out.print(A[i]+" "+A[j]+" "+A[k]+" ");
                        //System.out.println();
                        while(j<k && A[j]==A[j+1]){j++;}
                        while(j<k && A[k]==A[k-1]){k--;}
                        j++;
                        k--;
                    }
                    else if(A[j]+A[k]<tar){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }

    }
}
