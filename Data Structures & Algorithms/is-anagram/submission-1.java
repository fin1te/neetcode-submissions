class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            int currentValue = 0;
            if(sMap.containsKey(s1)) {
                currentValue = sMap.get(s1);
                sMap.put(s1,++currentValue);
            } else {
                sMap.put(s1,1);
            }
            if(tMap.containsKey(t1)) {
                currentValue = tMap.get(t1);
                tMap.put(t1,++currentValue);
            } else {
                tMap.put(t1,1);
            }
        }
        return sMap.equals(tMap);
    }
}
