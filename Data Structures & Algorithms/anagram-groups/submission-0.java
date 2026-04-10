class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        ArrayList<String> elements = new ArrayList<String>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            elements.add(strs[i]);
            if(!map.containsKey(String.valueOf(word))) {map.put(String.valueOf(word), new ArrayList<String>());}
            elements.addAll(map.get(String.valueOf(word)));
            map.put(String.valueOf(word), new ArrayList(elements));
            elements.clear();
        }
        for(ArrayList<String> item: map.values()) {
            ans.add(item);
        }
        return ans;
    }
}
