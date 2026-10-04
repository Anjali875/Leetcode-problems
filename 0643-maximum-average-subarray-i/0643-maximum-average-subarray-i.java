class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int start=0;
        int stop=k-1;
        int window_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=nums[i];
        }
        double max_sum=window_sum;
        while(stop<n-1){
            window_sum-=nums[start];
            start++;
            stop++;
            window_sum+=nums[stop];
            max_sum= Math.max(window_sum, max_sum);
        }
        return max_sum/k;
    }
}