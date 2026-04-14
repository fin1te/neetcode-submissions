class Solution {
    public boolean isPalindrome(String s) {
        String in = s.replaceAll("[^a-zA-Z0-9]","");
        int i=0, j=in.length()-1;
        while(j>i) {
            if(Character.toLowerCase(in.charAt(i))!=Character.toLowerCase(in.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
