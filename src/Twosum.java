import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int[]arr = {7,6,3,8,2};
        int target = 14;
        int ans[] = new int[2];
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap();
        for(int i =0;i<n;i++){
            int tar = target -arr[i];
            if(map.containsKey(tar)){
                ans[0] = map.get(tar);
                ans[1] = i;
            }else{
                map.put(arr[i],i);
            }
        }

        System.out.print(ans[0]+" "+ans[1]);


    }
}
