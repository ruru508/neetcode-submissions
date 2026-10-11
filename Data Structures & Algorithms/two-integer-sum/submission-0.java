class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> tmp = new HashMap<>();// num, index
        for(int i=0; i<nums.length; i++){
            int a =target - nums[i];
            if(tmp.containsKey(a)){
                res[0] = tmp.get(a);
                res[1] = i;
                return res;
            }
            else{
                tmp.put(nums[i], i);
            }
        }
        return res;
    }
}
