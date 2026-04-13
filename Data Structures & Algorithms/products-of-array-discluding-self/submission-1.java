class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prod = new int[len];

        // left products:
        prod[0] = 1;
        for(int i=1; i<len; i++) {
            prod[i] = prod[i-1] * nums[i-1];
        }

        //multiply right products
        int right = 1;
        for(int i=len-1; i>=0; i--) {
            prod[i] = prod[i] * right;
            right = nums[i] * right;
        }
        
        return prod;
    }
}  
