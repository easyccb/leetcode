import java.util.Arrays;

/**
 * 快速排序变种
 * 最小的k个数：输入整数数组 arr ，找出其中最小的 k 个数
 * 剑指 Offer 40.
 */
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        return quicksort(arr,0,arr.length-1,k-1);
    }

    public int[] quicksort(int[] arr,int i, int j,int k){
        if (i>=j) return null;

        int mid = partition(arr, i, j);

        if (mid == k) return Arrays.copyOf(arr,k+1);

        return mid > k ? quicksort(arr,i,mid-1,k) : quicksort(arr,mid+1,j,k);
    }

    public int partition(int[] arr,int i, int j){
        int mid= arr[i];

        while (i<j){
            while (i<j && arr[j]>mid) j--;
            arr[i] = arr[j];

            while (i<j && arr[i] < mid) i++;
            arr[j] = arr[i];
        }
        arr[i]=mid;

        return i;
    }
}