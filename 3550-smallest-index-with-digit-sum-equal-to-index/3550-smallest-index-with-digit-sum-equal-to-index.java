class Solution {
    public int smallestIndex(int[] nums) {
        int n= nums.length;
        for (int i=0;i<n;i++){
            int sum=0;
            String str= String.valueOf(nums[i]);
            for(int j=0;j<str.length();j++){
                int digit= str.charAt(j)-'0';
                sum+=digit;
                }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}
