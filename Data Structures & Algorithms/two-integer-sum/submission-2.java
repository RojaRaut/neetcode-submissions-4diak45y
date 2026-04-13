class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> numIndex = new LinkedHashMap<>();
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(numIndex.containsKey(diff)){
                return new int[] {numIndex.get(diff), i};
            }
            numIndex.put(nums[i], i);
        }
        return new int[2];
    }
}
