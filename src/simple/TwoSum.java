package simple;

import java.util.HashMap;

/**
 * 两数之和，返回数组下标
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] res=new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp=target-nums[i];

            if (map.containsKey(tmp)){
                res[0]= map.get(tmp);
                res[1]= i;
            }else {
                map.put(nums[i], i);
            }
        }

        return res;
    }
}
