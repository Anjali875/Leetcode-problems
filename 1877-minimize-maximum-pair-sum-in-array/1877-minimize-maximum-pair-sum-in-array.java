class Solution {
    public int minPairSum(int[] nums) {
        int n= nums.length;
        int maximum= 0;
        Arrays.sort(nums);
        int low= 0;
        int high=n-1;
        while(low<high){
            maximum= Math.max(nums[low]+nums[high],maximum);
            low++;
            high--;
        }
        return maximum;
    }
}