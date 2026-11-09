class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp = (n*(n+1))/2;
        int pre = 0;
        for(int i:nums) {
            pre = pre + i;
        }
        return exp - pre;
    }
}