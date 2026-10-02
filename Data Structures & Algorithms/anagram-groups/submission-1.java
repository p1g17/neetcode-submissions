class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> analgramMap = new HashMap<>();

        for (String str : strs) {
            List<String> currList;
            int strLength = str.length();
            int[] keyAsChar = new int[26];
            char[] strChars = str.toCharArray();
            for (int i = 0; i < strLength; i++) {
                char currentChar = strChars[i];
                int currentCount = keyAsChar[currentChar - 97];
                keyAsChar[currentChar - 97] = currentCount + 1;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                keyBuilder.append(keyAsChar[i]);
                keyBuilder.append("_");
            }
            String key = keyBuilder.toString();

            if (analgramMap.containsKey(key)) {
                currList = analgramMap.get(key);
            } else {
                currList = new ArrayList<>();
            }
            currList.add(str);
            analgramMap.put(key, currList);
        }
        return analgramMap.values().stream().toList();
    }
}
