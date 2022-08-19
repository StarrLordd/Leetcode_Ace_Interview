class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        
        while(l < r - 1){
            int m = (l+r)/2;
            if(nums[m] == target){return m;}
            if(nums[m] > target){
                if(nums[m] < nums[nums.length-1]){r = m;}
                else{
                    if(target < nums[0]){l = m;}
                    else{r = m;}
                }
            }else{ // mid < target
                if(nums[m] < nums[nums.length-1]){
                    if(target <= nums[nums.length-1]){l = m;}
                    else{r = m;}
                }else{
                    l = m;
                }
            }
        }
        if(nums[l] == target){return l;}
        if(nums[r] == target){return r;}
        return -1;
    }
}