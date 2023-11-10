import java.util.HashMap;

public class CountDistinct {
    public static void main(String []args){
        int [] A= {1,2,2,4,3,5,6,7,7,8};
        int k = 4;
        k_distinct_element(A,k);
    }
    public static void k_distinct_element(int A[],int k){

        //Here we use hashmap to store distint element with its frequency
        HashMap<Integer,Integer>map = new HashMap<>();
        // n is the length of an array
        int n = A.length;
        //we use sliding window technique to
        // count distinct element within a range i.e k.(index 0 to k-1)
        for(int i = 0;i<k;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }

        }
        //print the count of distinct element
        //using map.size()
        System.out.print(map.size()+" ");
        //Again me move from 1-4,then 2-5index and so on
      for(int i =k;i<n;i++){
          if(map.get(A[i-k])==1){
              map.remove(A[i-k]);
          }else{
              map.put(A[i-k],map.get(A[i-k])-1);
          }
          map.put(A[i], map.getOrDefault(A[i],0)+1);
          System.out.print(map.size()+" ");
      }
    }
}
