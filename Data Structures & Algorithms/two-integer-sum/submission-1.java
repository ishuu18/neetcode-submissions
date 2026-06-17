class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer, Integer> set1 = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(set1.containsKey(target - nums[i]))
            {
                int[] result = {set1.get(target-nums[i]), i};
                return result;
            }
            else
            {
                set1.put(nums[i], i);
            }


        }

        return new int[] {};
    }
}
