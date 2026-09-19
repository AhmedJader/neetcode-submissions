class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> cd = new HashSet<>();

       for(int i=0; i<nums.length; i++){
        if(cd.contains(nums[i])){
            return true;
        }

        cd.add(nums[i]);
       } 
       return false;
    }
}