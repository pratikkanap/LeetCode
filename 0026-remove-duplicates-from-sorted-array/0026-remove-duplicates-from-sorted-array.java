class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        //Add elements 
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        //copy elements in original arrray
        int n = 0;
        for (int num : set) {
            nums[n++] = num;
        }
        return set.size();
    }
}