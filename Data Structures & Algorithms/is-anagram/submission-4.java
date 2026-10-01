class Solution {
    public boolean isAnagram(String s, String t)
    {
        boolean result = false;
        if (s.length() != t.length())
        {
            result = false;
        }
        else
        {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < sArray.length; i++)
            {
                map1.put(sArray[i], map1.getOrDefault(sArray[i], 0) + 1);
                map2.put(tArray[i], map2.getOrDefault(tArray[i], 0) + 1);
            }
            for (int i = 0; i < 26; i++)
            {
                if (!map1.containsKey((char) (i + 97)) && !map2.containsKey((char) (i + 97)))
                {
                    continue;
                }
                else if (!map1.containsKey((char) (i + 97)) || !map2.containsKey((char) (i + 97)))
                {
                    result = false;
                    break;
                }
                else if (map1.containsKey((char) (i + 97)) && map2.containsKey((char) (i + 97)))
                {
                    result = Objects.equals(map1.get((char) (i + 97)), map2.get((char) (i + 97)));
                    if (!result)
                    {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
