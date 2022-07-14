
class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[128];
        for(char c:s.toCharArray()){
            arr[c]++;
        }
        int ans=0;
        for(int v:arr){
            ans+=(v/2)*2;
            if(v%2==1&&ans%2==0) ans++;
            //System.out.print(ans+" ");
        }
        return ans;
        
    }
}