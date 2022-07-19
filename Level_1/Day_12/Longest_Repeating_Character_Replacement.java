class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int []count=new int[26];
        int maxf=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            int curr_char=s.charAt(i)-'A';
            count[curr_char]++;
            maxf=Math.max(maxf,count[curr_char]);
            while(i-l+1-maxf>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}