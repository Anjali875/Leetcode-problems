class Solution {
    public int maxVowels(String s, int k) {
        int n= s.length();
        int start=0;
        int stop=k-1;
        int count=0;
        for(int i=0;i<k;i++){
            char c= s.charAt(i);
            if(isVowel(c)){
                count++;
            }
        }
        int max_count=count;
        while(stop<n-1){
            if (isVowel(s.charAt(start))) {
              count--;
            }
            start++;
            stop++;
            if (isVowel(s.charAt(stop))) {
              count++;
            }
            max_count= Math.max(count, max_count);
        }
        return max_count;
    }
    private boolean isVowel(char c) {
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        }
}