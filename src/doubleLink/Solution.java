package doubleLink;

public class Solution {

    // 奇数在前，偶数在后
    public int[] exchange(int[] nums) {
        int count = nums.length;

        int i=0,j=count-1;

        while (i<j){

            while (i<j && nums[i]%2!=0) i++;  // 找到偶数
            while (i<j && nums[j]%2==0) j--;  // 找到奇数

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;

            i++;
            j--;
        }

        return nums;
    }

}
