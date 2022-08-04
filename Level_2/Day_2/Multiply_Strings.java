class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length(), n=num2.length();
        int nums[]=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=nums[i+j+1]+mul;
                nums[i+j]+=sum/10;
                nums[i+j+1]=sum%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int num:nums){
            if(sb.length()!=0 || num!=0) sb.append(num);
        }
        return sb.length()==0?"0":sb.toString();
    }
}