class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[]=new int[26];
        //Arrays.fill(arr,0);
        for(int i=0;i<tasks.length;i++){
            arr[tasks[i]-'A']++;
            
        }
        Arrays.sort(arr);
        int chunks=arr[25]-1;
        int idle=chunks*n;
        for(int i=24;i>=0;i--){
            idle=idle-Math.min(chunks,arr[i]);
        }
        
        if(idle<0) return tasks.length;
        return tasks.length+idle;
    }
}