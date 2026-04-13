class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        TreeSet<Integer> uniqueSortedSet = new TreeSet<>();
        for(int num : nums) {
            uniqueSortedSet.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int val : uniqueSortedSet) {
            list.add(val);
        }
        int res = 1, count = 1;
        uniqueSortedSet = new TreeSet<>();
        uniqueSortedSet.add(count);
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i+1) - list.get(i) == 1) count++;
            else {
                uniqueSortedSet.add(count);
                count=1;
            } 
        }
        uniqueSortedSet.add(count);
        return (Integer)uniqueSortedSet.last();
    }
}
