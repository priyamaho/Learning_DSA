import java.util.*;
public class FactorCount {

    /* Problem : factor Sort */
    public static int factorCount(int val) {
// todo : write optimise code
        int fcount = 0;
        for(int i = 1; i <= val; i++) {
            if(val % i == 0) {
                fcount++;
            }}
        return fcount;
    }
    public static int[] factorSort(int[] arr) {
        int n = arr.length;
// convert int array into Integer array
        Integer[] A = new Integer[n];
        for(int i = 0; i < n; i++) {
            A[i] = arr[i];
        }
        Arrays.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int fa = factorCount(a);
                int fb = factorCount(b);
                if(fa < fb) {
// a come first
                    return -1;
                } else if(fa > fb) {
// b compe first
                    return 1;
                } else {
// if both are equal
// decide according to value of a and b
                    return a - b;
                }}
        });
// fill arr from A
        for(int i = 0; i < n; i++) {
            arr[i] = A[i];
        }
        return arr;
    }
    public static void main(String args[]) {
// Your code goes here
        int[] arr = {4, 7, 6, 9, 8, 2, 10};
        System.out.println(Arrays.toString(arr));
        arr = factorSort(arr);
        System.out.println(Arrays.toString(arr));
    }}


