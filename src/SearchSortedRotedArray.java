
public class SearchSortedRotedArray {
    public static void main(String[]args){
       int[] nums = {2,5,6,0,0,1,2};
       int target = 3;
        int minindx = minindex(nums);
        int ans = binarysearch(nums,0,minindx-1,target);
        if(ans == -1){
            ans = binarysearch(nums,minindx,nums.length-1,target);
        }
        System.out.print(ans);
    }
    public static int binarysearch(int nums[],int l,int r,int target){
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return 1;
            }else if(nums[mid]<target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
    public static int minindex(int arr[]){
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]<arr[r]){
                r=mid;
            }else{
                l = mid-1;
            }
        }
        return l;
    }

}
