class Solution {
    public boolean check(int[] nums) {
        int count = countDrops(nums, 0);

        return count <= 1;
    }

    private int countDrops(int[] nums, int i) {
        if (i == nums.length - 1) {
            return nums[i] > nums[0] ? 1 : 0;
        }

        int drop = nums[i] > nums[i + 1] ? 1 : 0;

        return drop + countDrops(nums, i + 1);
    }
}