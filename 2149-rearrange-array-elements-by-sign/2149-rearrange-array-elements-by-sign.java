class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[nums.length];
        for(int i:nums) {
            if(i>0) {
                ans[pos]=i;
                pos=pos+2;
            } else {
                ans[neg]=i;
                neg=neg+2;
            }
        }
        return ans;
    }
}