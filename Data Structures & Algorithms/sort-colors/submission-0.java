class Solution {
    private void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int low =0 ;
        int high =nums.length-1;
        int curr= 0;
        while(curr<=high){
            if(nums[curr]==0){
                swap(nums, low,curr);
                low++;curr++;
            }
            else if(nums[curr]==2){
                swap(nums,curr,high);
                high--;
            }
            else{
                curr++;
            }
        }
    }
}