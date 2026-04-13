class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        //int res=1;
        int[] pro = new int[len];

        for(int i=0; i<len; i++) {
            int res=1;
            for(int j=0; j<len; j++) {
                if(i != j) {
                    res = res * nums[j];
                }
            }
            pro[i] = res;
        }
        return pro;
    }
}  
