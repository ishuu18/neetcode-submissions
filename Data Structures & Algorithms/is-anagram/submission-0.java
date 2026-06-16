class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();

        for(Character x: s.toCharArray())
        {
            if(!map1.containsKey(x))
            {
                map1.put(x,1);
            }
            else
            {
                map1.put(x, 1+ map1.get(x));
            }
        }


        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character y: t.toCharArray())
        {
            if(!map2.containsKey(y))
            {
                map2.put(y,1);
            }
            else
            {
                map2.put(y, 1+map2.get(y));
            }
        }

        return map1.equals(map2);


    }
}
