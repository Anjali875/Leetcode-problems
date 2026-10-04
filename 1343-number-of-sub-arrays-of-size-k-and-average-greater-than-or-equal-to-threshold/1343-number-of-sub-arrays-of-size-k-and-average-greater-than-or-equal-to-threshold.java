class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n= arr.length;
        int start=0;
        int stop=k-1;
        int count=0;
        int window_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=arr[i];
        }
        if(window_sum/k>=threshold){
                count++;
            }
        while(stop<n-1){
            window_sum-=arr[start];
            start++;
            stop++;
            window_sum+=arr[stop];
            if(window_sum/k>=threshold){
                count++;
            }
        }
        return count;
    }
}