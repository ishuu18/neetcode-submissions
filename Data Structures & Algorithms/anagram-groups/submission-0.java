class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       if(strs == null || strs.length == 0)
       {
            return new ArrayList<>();
       }
       Map<String, List<String>> map = new HashMap<>();
       for(String i: strs)
       {
            int[] count = new int[26];

            for(char c: i.toCharArray())
            {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(i);
       }

       return new ArrayList<>(map.values());
    }
}
