import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        x.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                    }
                }
            }
        }
    }
}