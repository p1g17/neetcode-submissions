class Solution {
        public int[] topKFrequent(int[] nums, int k) {

        //Create count map
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num:nums)
        {
            frequencyMap.put(num,frequencyMap.getOrDefault(num, 0)+1);
        }

        // Create bucket for each count
        List[] frequencyArrayList = new List[nums.length];
        for(Map.Entry entry:frequencyMap.entrySet())
        {
            Integer number = (Integer) entry.getKey();
            Integer count = (Integer) entry.getValue();
            if(frequencyArrayList[count-1] == null)
            {
                frequencyArrayList[count-1] = new ArrayList<>();
            }
            frequencyArrayList[count-1].add(number);
        }

        //find top k element
        int []topK = new int[k];
        int topKIndex = 0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if (frequencyArrayList[i] != null)
            {
                List topKList = frequencyArrayList[i];
                Iterator<Integer> iterator = topKList.iterator();
                while (k > topKIndex && iterator.hasNext())
                {
                    topK[topKIndex] = (Integer) iterator.next();
                    topKIndex++;
                }
            }
        }
        return topK;
    }
}
