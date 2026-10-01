class Solution {
       public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++)
        {
            var value = nums[i];
            if (map.containsKey(value) && map.get(value) != i)
            {
                int index1 = Math.min(map.get(value),i);
                int index2 = Math.max(map.get(value),i);
                result = new int[]{index1,index2};
            }
        }
        return result;
    } 
}
