import javax.sound.midi.SysexMessage;

public class FirstAndLastElement {
    public static void main(String[]args){
        int[]A ={2,3,4,5,7,7,7,8,8};
        int target = 7;

        int l = 0;
        int r = A.length-1;
        int first = -1;
        while(l<r){
            int mid = l+r/2;
            if(A[mid]==target){
                first = mid;
                r = mid-1;
            }
            else if(A[mid]<target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        int le = 0;
        int ri = A.length-1;
        int last = -1;

        while(le<ri){
            int mid1 = (le+ri)/2;
            if(A[mid1]==target){
                last = mid1;
                le = mid1+1;
            }
            else if(A[mid1]<target){
                le = mid1+1;
            }else{
                ri = mid1-1;
            }
        }
        System.out.print(first +" "+last);
    }

}
