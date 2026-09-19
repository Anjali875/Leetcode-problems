import java.util.*;
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int MOD=1000000007;
        int[] prefix= new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int[]sums= new int[n*(n+1)/2]; 
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int subarraySum;
                if (i == 0) {
                   subarraySum = prefix[j];
                } else {
                   subarraySum = prefix[j] - prefix[i-1];
                }
                sums[index] = subarraySum;
                index++;
            }
        }
        Arrays.sort(sums);
        int sum = 0;
        for (int k = left - 1; k <= right - 1; k++) {
            sum = (sum + sums[k]) % MOD;
        }
        return sum;
    }
}