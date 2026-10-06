class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res = false;
        Set<Integer> tmp = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int t = nums[i];
            if(tmp.contains(t)) return true;
            tmp.add(t);
        }
        return res;
    }
}