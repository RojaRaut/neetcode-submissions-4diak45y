class Solution {
    public boolean hasDuplicate(int[] nums) {
           Set<Integer> hs = new HashSet<Integer>();
           for(int num : nums) hs.add(num);

           if(hs.size() < nums.length) return true;
           else return false;
    }
}
