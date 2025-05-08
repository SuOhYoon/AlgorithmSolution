class Solution {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        if (idx == -1) {
            return "";
        } 
        return myString.substring(0, idx + pat.length());
    }
}