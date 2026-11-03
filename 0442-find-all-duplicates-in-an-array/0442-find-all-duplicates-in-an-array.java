class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int a = Math.abs(nums[i]) - 1;
            if(nums[a]<0) {
                li.add(a+1);
            } else {
                nums[a] = - nums[a];
            }
        } 
        return li;
    }
}