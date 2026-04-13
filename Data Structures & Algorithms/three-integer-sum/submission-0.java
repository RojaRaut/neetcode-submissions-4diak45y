class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // sort the input
        Arrays.sort(nums);

        //approach: fix one element and find two others using two pointers
        for(int i=0; i<nums.length-2; i++) {

            // skip duplicates for i
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l = i + 1;
            int r = nums.length-1;

            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(temp);

                    //skip duplicates for other two elements
                    while(l<r && nums[l] == nums[l+1]) l++;
                    while(l<r && nums[r] == nums[r-1]) r--;

                    l++;
                    r--;
                } else if(sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
