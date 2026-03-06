class Solution {
    public boolean checkOnesSegment(String s) {
        int k = s.length();
        boolean m = false;
        for(int i = 0; i < k; i++){
            if(s.charAt(i) == '0'){
                m = true;
            }
            else if(m){
                return false;
            }
        }
        return true ;
    }
}
