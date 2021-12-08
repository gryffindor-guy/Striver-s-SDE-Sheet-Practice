package Day 1;
// https://leetcode.com/problems/next-permutation/submissions/
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int start = nums.length - 2;
        while(start >= 0 && nums[start + 1] <= nums[start]) {
            start--;
        }
        if (start >= 0) {
            int end = nums.length - 1;
             while (nums[end] <= nums[start]) {
                 end--;
             }
            swap(nums, start, end);
            int last = nums.length - 1;
            start++;
            while (start < last) {
                swap(nums, start, last);
                start++;
                last--;
            }
        } else {
            int i = 0;
            int j = nums.length - 1;
            while (i < j) {
                swap(nums, i++, j--);
            }
        }
        
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}