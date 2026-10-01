class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicatePresent = false;
        Map<Integer,Boolean> dataMap =new HashMap<>();
        for (int i : nums)
        {
            if(!dataMap.containsKey(i))
            {
                dataMap.put(i,true);
            }
            else
            {
                isDuplicatePresent = true;
                break;
            }
        }
        return isDuplicatePresent;
    }
}