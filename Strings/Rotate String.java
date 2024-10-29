class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String helper = s+s;
        return helper.contains(goal);
    }
}
