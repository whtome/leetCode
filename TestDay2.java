package bit.com;


import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1;j++) {
                for (int k = j+1; k < n; k++) {
                    if (0 == nums[i]+nums[j]+nums[k]) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list.add(list1);
                    }
                }
            }
        }
        return list;
    }
}

public class TestDay2 {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        Solution1 solution = new Solution1();
        List list = solution.threeSum(nums);
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
