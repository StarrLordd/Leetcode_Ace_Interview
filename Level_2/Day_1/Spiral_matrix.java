class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0, bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;
        int dir=0,i=0;
        
        ArrayList<Integer> res=new ArrayList<>();
        
        while(top<=bottom && left<=right){
            if(dir==0){
                for(i=left;i<=right;i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1){
                for(i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir==3){
                for(i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return res;
    }
}