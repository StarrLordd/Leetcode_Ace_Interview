class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        
        for(int i=00;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else map.put(words[i],1);
        }
        
        for(Map.Entry m:map.entrySet()){
            String key=(String)m.getKey();
            int val=(int)m.getValue();
            
            String rev=reverse(key);
            if(map.containsKey(rev)){
                if(rev.equals(key)){
                    int y=map.get(rev);
                    if(y%2!=0){
                        y--;
                    }
                    count+=(2*y);
                    map.replace(rev,map.get(rev)-y);  
                }
                else{
                    int min=Math.min(val,map.get(rev));
                    count+=(4*min);
                    map.replace(key,val-min);
                    map.replace(rev,map.get(rev)-min);
                }
            }
        }
        for(Map.Entry m: map.entrySet())
        {
            String key=(String)m.getKey();
            int val=(int)m.getValue();
            if(key.charAt(0)==key.charAt(1) && val>0)
            {
                count+=2;
                break;
            }
        }
        return count;
    }
    String reverse(String s){
        String ans="";
        for(int i=1;i>=0;i--)
            ans+=s.charAt(i);
        
        return ans;
    }
}