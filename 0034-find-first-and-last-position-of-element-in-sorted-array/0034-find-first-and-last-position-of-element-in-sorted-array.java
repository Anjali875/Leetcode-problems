class Solution {
    int lowerBound(int[] nums, int target, int n){
            int low=0;
            int high=n-1;
            int ans=n;
            while(low<=high){
                int mid= (low+high)/2;
                if(nums[mid]>=target){
                    ans=mid;
                    high=mid-1;
                } else{
                    low=mid+1;
                }
            }
            return ans;
        }
        int upperBound(int[] nums, int target, int n){
            int low=0;
            int high=n-1;
            int ans=n;
            while(low<=high){
                int mid= (low+high)/2;
                if(nums[mid]>target){
                    ans=mid;
                    high=mid-1;
                } else{
                    low=mid+1;
                }
            }
            return ans;
        }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerBound(nums,target,n);
        if(lb==n || nums[lb]!=target){
            return new int[] {-1,-1};
        } else{
            return new int[]{lb,upperBound(nums,target,n)-1};
        }
    }
}