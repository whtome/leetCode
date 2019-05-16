package bit.com;



public class TestDay1 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        int[] data = twoSum(nums,target);
        for (int i : data) {
            System.out.println(data[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] data = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    data[0] = i;
                    data[1] = j;
                }
            }
        }
        return data;
    }

}
