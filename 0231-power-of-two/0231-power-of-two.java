class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n!=1) {
            if((n&1)==1) {
                return false;
            } 
            if(n==0) {
                return false;
            }
            int temp = n;
            temp = temp>>1;
            n = temp;
        }
        return true;
    }
}