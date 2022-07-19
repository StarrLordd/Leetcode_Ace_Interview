class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<Integer>();
        int a=s.length();
        int b=p.length();
        int x=0;
        char arr[]=p.toCharArray();
        Arrays.sort(arr);
        p=new String(arr);
        for(int i=b;i<=a;i++){
            char myarr[]=s.substring(x,i).toCharArray();
            Arrays.sort(myarr);
            String str=new String(myarr);
            if(p.equals(str)) list.add(x);
            x++;
        }
        return list;
    }
}