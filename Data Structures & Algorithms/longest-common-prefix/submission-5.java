class Solution { 
    public String longestCommonPrefix(String[] strs) {
        String ans = new String("");
        String tempAns = new String("");
        boolean charDiff = false;
        int minLength=1000;
        for(int k=0; k<strs.length; k++) {
            if(strs[k].length() < minLength) minLength = strs[k].length();
        }
        for(int i=0; i<minLength; i++) {
            tempAns = String.valueOf(strs[0].charAt(i));
            for(int j=0; j<strs.length-1; j++) {
            if (strs[j].charAt(i)!=strs[j+1].charAt(i)) charDiff=true;
            }
            if(!charDiff) ans = ans + tempAns;
            else if(charDiff) return ans;
        }
        return ans;
    }
}