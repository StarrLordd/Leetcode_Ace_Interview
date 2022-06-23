class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=s.length();
        int l=t.length();
        if(s.length()==0)return true;
        if(t.length()==0) return false;
        boolean status=true;
        int i=0,j=0;
        while(i<l){
            if(t.charAt(i)==s.charAt(j)){
                j++;i++;if(j==len) break;
            }else i++;
        }
        if(j==len) return true;
        else return false;
    }
}