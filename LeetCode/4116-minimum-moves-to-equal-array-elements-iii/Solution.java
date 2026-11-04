class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int num : nums)
        {
            sum += num;
            max = Math.max(max,num);
        }
        return n * max - sum;
    }
}