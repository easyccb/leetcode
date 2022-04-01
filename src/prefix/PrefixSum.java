package prefix;

/**
 * 前缀和
 * 后面几个数的和 等于 总和减去前面几个数的和
 */
public class PrefixSum {

    public int pivotIndex(int[] nums) {
        int total =0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum-nums[i] == total-sum) return i;
        }

        return -1;
    }
}
