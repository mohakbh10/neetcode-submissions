class Solution {
    public int maxProduct(int[] nums) {
        int max_so_far=nums[0];
        int min_so_far=nums[0];
        int res=nums[0];
        for(int i =1;i<nums.length;i++){
            int curr = nums[i];
            if(curr<0){
                int temp=min_so_far;
                min_so_far=max_so_far;
                max_so_far=temp;
            }
            max_so_far=max_so_far*curr;
            max_so_far=Math.max(curr,max_so_far);
            min_so_far=min_so_far*curr;
            min_so_far=Math.min(curr,min_so_far);

            res=Math.max(max_so_far,res);
        }
            
            
        return res;
    }
}
