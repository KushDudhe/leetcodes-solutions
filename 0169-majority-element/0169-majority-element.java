class Solution {
    public int majorityElement(int[] nums) {
        int cand = nums[0];
        int vote = 0;
        for(int i=0;i<nums.length;i++) {
            if(vote==0) {
                cand = nums[i];
            }
            if(cand==nums[i]) {
                vote++;
            } else {
                vote--;
            }

        }
        return cand;
    }
}